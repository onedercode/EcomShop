/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function makeDocument() {
    var frame = document.getElementById("theFrame");
          
    var doc = document.implementation.createHTMLDocument("New Document");
    var p = doc.createElement("p");
    p.innerHTML = "This is a new paragraph.";
  
    try{doc.body.appendChild(p);}
    catch(e){console.log(e);}

    // Copy the new HTML document into the frame

    var destDocument = frame.contentDocument;
    var srcNode = doc.documentElement;
    var newNode = destDocument.importNode(srcNode, true);
  
    destDocument.replaceChild(newNode, destDocument.documentElement);
}