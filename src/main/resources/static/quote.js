function handleClick() {
  fetch("/v1/quotes/quote/new", { method: 'GET' }).then((res) => {
    if (res.ok) {
      return res.json();
    }
    console.log("Request failed");
  }).then((res) => {
    document.getElementById("quote").innerText = res.quote;
    document.getElementById("author").innerText = res.author;
  });
//  alert("aver di");
}

function handleTweet() {
  alert("No me han implementado");
}