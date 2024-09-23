package org.example.OpenSource;

import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.commonmark.renderer.text.TextContentRenderer;

public class CommonMark {

    public static void main(String[] args) {
        String markdownText = "This is **Markdown**";  // Markdown text to parse

        // Parse the Markdown text
        Parser parser = Parser.builder().build();
        Node document = parser.parse(markdownText);

        // Render to HTML
        HtmlRenderer htmlRenderer = HtmlRenderer.builder().build();
        String html = htmlRenderer.render(document);  // Rendered HTML
        System.out.println("HTML Output:");
        System.out.println(html);

        // Render to Plain Text
        TextContentRenderer textRenderer = TextContentRenderer.builder().build();
        String plainText = textRenderer.render(document);  // Rendered Plain Text
        System.out.println("Plain Text Output:");
        System.out.println(plainText);
    }
}
