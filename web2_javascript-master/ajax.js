const fetchPage = (elementName) => {
  fetch(elementName).then((res) => {
    res.text().then((text) => {
      document.querySelector("article").innerHTML = text;
    });
  });
};

if (location.hash) {
  fetchPage(location.hash.substring(2));
} else {
  fetchPage("welcome");
}

let tags = "";
fetch("list").then((res) => {
  res.text().then((txt) => {
    console.log(txt);
    const items = txt.split(",");
    console.log(items);
    for (const elem of items) {
      const item = elem.trim();
      const tag = `<li><a href="#!${item}" onclick="fetchPage('${item}')">${item}</a></li>`;
      console.log(tag);
      tags += tag;
    }
    document.querySelector("#nav").innerHTML = tags;
  });
});
