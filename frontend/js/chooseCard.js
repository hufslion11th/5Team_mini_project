let cardCount = 0;

const cardBox = document.getElementById("cardBox");
for (let i = 1; i < 79; i++) {
  const image = document.createElement("img");
  image.classList.add("card");
  image.src = "/frontend/card-backside.png";
  cardBox.appendChild(image);
}

const card = document.getElementsByClassName("card");
for (let i = 0; i < card.length; i++) {
  card.item(i).addEventListener("click", () => {
    if (card.item(i).classList.contains("card_onclick")) {
      card.item(i).classList.remove("card_onclick");
      cardCount -= 1;
      return;
    }

    if (cardCount >= 3) {
      return;
    } else {
      cardCount += 1;
      card.item(i).classList.add("card_onclick");
    }
  });
}
