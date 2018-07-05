package enzyme

import kotlinext.js.jsObject

fun configure(adapter: EnzymeAdapter) {
    enzyme.configure(jsObject<EnzymeOptions> {
        this.adapter = adapter
    })
}

