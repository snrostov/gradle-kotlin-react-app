import kotlinx.html.js.onClickFunction
import kotlinx.html.onClick
import kotlinx.html.title
import org.w3c.dom.events.Event
import react.*
import react.dom.button
import react.dom.div
import react.dom.h1

interface AppProps : RProps {
    var title: String
    var likes: Int
}

interface AppState : RState {
    var likes: Int
}

class App(props: AppProps) : RComponent<AppProps, AppState>(props) {
    override fun AppState.init(props: AppProps) {
        likes = props.likes
    }

    override fun RBuilder.render() {
        h1 {
            +props.title
        }

        div {
            +"Hello, world! "

            button {
                attrs.onClickFunction = ::like
                +"Like"
                if (state.likes > 0) {
                    +" (${state.likes})"
                }
            }
        }
    }

    private fun like(event: Event) {
        setState {
            likes++
        }
    }
}

fun RBuilder.app(title: String, likes: Int = 0) = child(App::class) {
    attrs.title = title
    attrs.likes = likes
}
