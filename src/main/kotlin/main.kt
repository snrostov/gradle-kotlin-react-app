import react.dom.div
import react.dom.render
import kotlin.browser.document

fun main(args: Array<String>) {
    document.addEventListener("DOMContentLoaded", {
        render(document.getElementById("content")) {
            div {
                +"Hello, world!"
            }
        }
    })
}