const totalResultChatBox = document.querySelector(".totalResult_chatBox");
const questionInput = document.querySelector(".insert_text_input");
const chatInput = document.querySelector(".totalResult_input");
const shareMychat = document.querySelector(".share_myChat");
const shareTataroChat = document.querySelector(".share_tataroChat");
let first = true;
let userMessages = [];
let assistantMessages = [];

// 채팅 보낸 시간을 리턴하는 함수
const sendTime = () => {
  const time = new Date();
  const hour = time.getHours();
  const minutes = time.getMinutes();
  let meridiem; // 오전, 오후 구분
  let hour2; // 시간
  if (hour < 12) {
    meridiem = "오전";
    hour2 = hour;
  } else {
    meridiem = "오후";
    hour2 = hour - 12;
  }
  const myChatTimeString = `${meridiem} ${hour2}:${minutes}`;
  return myChatTimeString;
};

// 내 채팅을 채팅창에 넣기
const myChat = () => {
  const myChatBox = document.createElement("div");
  myChatBox.classList.add("totalResult_myChatBox");
  const myChatTime = document.createElement("div");
  myChatTime.classList.add("totalResult_myChatTime");
  const myChat = document.createElement("div");
  myChat.classList.add("totalResult_myChat");
  myChatTime.innerText = sendTime();
  myChatBox.appendChild(myChatTime);
  if (!!questionInput.value == true) {
    myChat.innerText = questionInput.value;
    userMessages.push(questionInput.value);
    myQuestion = questionInput.value;
    questionInput.value = "";
  } else {
    myChat.innerText = chatInput.value;
    userMessages.push(chatInput.value);
  }
  myChatBox.appendChild(myChat);
  totalResultChatBox.appendChild(myChatBox);
  totalResultChatBox.scrollTop = totalResultChatBox.scrollHeight;
  return myQuestion;
};

//타타로 채팅을 채팅창에 넣기
const tataroChat = (assistant, myQuestion) => {
  const tataroChatBox = document.createElement("div");
  tataroChatBox.classList.add("totalResult_tataroChatBox");
  const tataroChatTime = document.createElement("div");
  tataroChatTime.classList.add("totalResult_tataroChatTime");
  const tataroChat = document.createElement("div");
  tataroChat.classList.add("totalResult_tataroChat");
  tataroChat.innerText = assistant;
  tataroChatTime.innerText = sendTime();
  tataroChatBox.appendChild(tataroChatTime);
  //타타로의 첫 채팅인 경우
  if (first == true) {
    first = false;
    const totalResultButton = document.createElement("div");
    totalResultButton.classList.add("totalResult_button");
    const totalResultShare = document.createElement("div");
    totalResultShare.classList.add("totalResult_share");
    totalResultShare.innerText = "이미지 저장";
    const totalResultResume = document.createElement("div");
    totalResultResume.classList.add("totalResult_share");
    totalResultResume.innerText = "다시하기";
    totalResultButton.appendChild(totalResultShare);
    totalResultButton.appendChild(totalResultResume);
    tataroChat.appendChild(totalResultButton);
    shareMychat.innerText = myQuestion;

    totalResultResume.addEventListener("click", () => {
      window.location.reload();
    });
    totalResultShare.addEventListener("click", () => {
      totalResultPage.style.display = "none";
      sharePage.style.display = "flex";
    });
    shareTataroChat.innerText = assistant;
  }
  tataroChatBox.appendChild(tataroChat);
  totalResultChatBox.appendChild(tataroChatBox);
  totalResultChatBox.scrollTop = totalResultChatBox.scrollHeight;
};

async function getTaro() {
  try {
    const myQuestion = myChat();
    // 타로 질문 주고 결과 받는 api
    const response = await fetch("http://localhost:3000/taro", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify({
        userMessages: userMessages,
        assistantMessages: assistantMessages,
      }),
    });
    const data = await response.json();
    assistantMessages.push(data.assistant);
    tataroChat(data.assistant, myQuestion);
    console.log(data);
    return data;
  } catch (error) {
    console.log(error);
  }
}
