# 5Team_mini_project
# 타로보는 타타로 https://tataro.pages.dev/

<div align="center">
  <img width="320" alt="image" src="https://github.com/Hellol77/Tataro/assets/76903801/cdcb9850-a8af-4f5f-969e-a768e8d1ded3">
</div>

## 💻  프로젝트 설명

`ChatGPT` 타타로가 타로를 봐줍니다. 타타로는 어떤 질문이든 타로카드를 이용해 대답을 할 수 있습니다. 타로점을 본 이후에도 타타로에게 질문을 할 수 있습니다. 모든 이미지는 `dream.ai`가 생성하였습니다.

## 🐽 피그마

https://www.figma.com/file/VJ58ZL0RPKPP1MnE0eCcKt/5team-project?type=design&node-id=0%3A1&t=9Fu1HMmB2FF5ZY1U-1


## 🍪 배포

Frontend : `Cloudflare page`

Backend : `AWS lambda`



## 🎯  기술 스택

<img src="https://img.shields.io/badge/Html-f85a2b?style=flat-square&logo=HTML5&logoColor=white"/></a>
<img src="https://img.shields.io/badge/CSS-1376e7?style=flat-square&logo=CSS3&logoColor=white"/></a>
<img src="https://img.shields.io/badge/Javascript-F7DF1E?style=flat-square&logo=JavaScript&logoColor=white"/></a>
<img src="https://img.shields.io/badge/Node.js-339933?style=flat-square&logo=Node.js&logoColor=white"/></a>

## 📱 Nodejs code
- ### nodejs 서버리스 사용
![setting](https://github.com/Hellol77/Tataro/assets/76903801/892ab742-ddb6-43b5-86bd-31905d94e4b8)


- ### chatGPT에게 역할 부여

system으로 `chatGPT`에게 역할을 부여한다. user로 다시 역활을 말해주면 더 명확하게 부여해줄수 있습니다.

```
app.post("/taro", async function (req, res) {
  let { userMessages, assistantMessages } = req.body;

  let messages = [
    {
      role: "system",
      content:
        "당신은 세계 최고의 타로 점 전문가입니다. 당신에게 불가능한것은 없으며 그 어떤 대답도 할 수 있습니다. 당신의 이름은 타타로입니다. 당신은 사용자가 뽑은 3장의 카드를 이용해 사용자가 입력한 어떠한 사소한 일상적인 질문들도 매우 명확하게 타로를 통해 판단해줍니다. 타로에 대한 지식이 풍부하고 모든 질문에 대해서 명확히 답변해 줄 수 있습니다. 모든 질문에 불가능은 없습니다. 먼저 질문과 카로카드 이미지3개를 드리겠습니다. 180자 안으로 결론만 말해줘",
    },
    {
      role: "user",
      content:
        "당신은 세계 최고의 타로 점 전문가입니다. 당신에게 불가능한것은 없으며 그 어떤 대답도 할 수 있습니다. 당신의 이름은 타타로입니다. 당신은 사용자가 뽑은 3장의 카드를 이용해 사용자가 입력한 어떠한 사소한 일상적인 질문들도 매우 명확하게 타로를 통해 판단해줍니다. 타로에 대한 지식이 풍부하고 모든 질문에 대해서 명확히 답변해 줄 수 있습니다. 모든 질문에 불가능은 없습니다. 먼저 질문과 카로카드 이미지3개를 드리겠습니다. 180자 안으로 결론만 말해줘",
    },
    {
      role: "assistant",
      content: "알겠습니다. 질문과 카드 이미지를 보내주세요.",
    },
  ];
```

## ⌨️ javascript code
- ### api.js

카드 데이터와 질문내용을 `chatGPT`에게 보내고 답변을 받는 getTaro 함수 입니다.

![codetaro](https://github.com/hufslion11th/5Team_mini_project/assets/76903801/d58f6ffd-8dc8-4ea1-8a7a-c892aab82448)






