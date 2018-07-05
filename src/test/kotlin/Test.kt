import enzyme.mount
import enzyme.react16.React16Adapter
import react.buildElements
import react.dom.button
import react.dom.div
import kotlin.test.Test
import kotlin.test.assertEquals

val myEnzyme = initEnzyme()

fun initEnzyme() {
    enzyme.configure(React16Adapter())
}

class MyTest {
    @Test
    fun test() {
        val wrapper = mount<AppProps, AppState>(buildElements {
            app("test")
        })

        assertEquals(
                true,
                wrapper.contains(buildElements {
                    div { +"Hello, world!" }
                })
        )
    }
}