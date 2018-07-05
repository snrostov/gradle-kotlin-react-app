// OUT:
@file:JsModule("enzyme")
package enzyme

import org.w3c.dom.HTMLElement
import kotlin.js.Json

open external class ElementClass : __React.Component<Any, Any>
external interface EnzymePropSelector {
    @nativeGetter
    operator fun get(key: String): Any?
    @nativeSetter
    operator fun set(key: String, value: Any)
}
external interface CommonWrapper<P, S> {
    fun <P2> find(component: __React.ComponentClass<P2>): CommonWrapper<P2, Any>
    fun <P2> find(statelessComponent: __React.StatelessComponent<P2>): CommonWrapper<P2, Any>
    fun find(props: EnzymePropSelector): CommonWrapper<Any, Any>
    fun find(selector: String): CommonWrapper<__React.HTMLAttributes, Any>
    fun findWhere(predicate: (wrapper: CommonWrapper<Any, Any>) -> Boolean): CommonWrapper<Any, Any>
    fun <P2> filter(component: __React.ComponentClass<P2>): CommonWrapper<P2, Any>
    fun <P2> filter(statelessComponent: __React.StatelessComponent<P2>): CommonWrapper<P2, Any>
    fun filter(props: EnzymePropSelector): CommonWrapper<Any, Any>
    fun filter(selector: String): CommonWrapper<__React.HTMLAttributes, Any>
    fun filterWhere(predicate: (wrapper: CommonWrapper<P, S> /* this */) -> Boolean): CommonWrapper<P, S> /* this */
    fun contains(node: __React.ReactElement<Any>): Boolean
    fun containsMatchingElement(node: __React.ReactElement<Any>): Boolean
    fun containsAllMatchingElements(nodes: Array<__React.ReactElement<Any>>): Boolean
    fun containsAnyMatchingElements(nodes: Array<__React.ReactElement<Any>>): Boolean
    fun equals(node: __React.ReactElement<Any>): Boolean
    fun matchesElement(node: __React.ReactElement<Any>): Boolean
    fun hasClass(className: String): Boolean
    fun `is`(selector: String): Boolean
    fun `is`(selector: __React.StatelessComponent<Any>): Boolean
    fun `is`(selector: __React.ComponentClass<Any>): Boolean
    fun `is`(selector: Json): Boolean
    fun isEmpty(): Boolean
    fun not(selector: String): CommonWrapper<P, S> /* this */
    fun not(selector: __React.StatelessComponent<Any>): CommonWrapper<P, S> /* this */
    fun not(selector: __React.ComponentClass<Any>): CommonWrapper<P, S> /* this */
    fun not(selector: Json): CommonWrapper<P, S> /* this */
    fun <P2> children(component: __React.ComponentClass<P2>): CommonWrapper<P2, Any>
    fun <P2> children(statelessComponent: __React.StatelessComponent<P2>): CommonWrapper<P2, Any>
    fun children(props: EnzymePropSelector): CommonWrapper<Any, Any>
    fun children(selector: String): CommonWrapper<__React.HTMLAttributes, Any>
    fun children(): CommonWrapper<Any, Any>
    fun <P2, S2> childAt(index: Number): CommonWrapper<P2, S2>
    fun <P2> parents(component: __React.ComponentClass<P2>): CommonWrapper<P2, Any>
    fun <P2> parents(statelessComponent: __React.StatelessComponent<P2>): CommonWrapper<P2, Any>
    fun parents(props: EnzymePropSelector): CommonWrapper<Any, Any>
    fun parents(selector: String): CommonWrapper<__React.HTMLAttributes, Any>
    fun parents(): CommonWrapper<Any, Any>
    fun parent(): CommonWrapper<Any, Any>
    fun <P2> closest(component: __React.ComponentClass<P2>): CommonWrapper<P2, Any>
    fun <P2> closest(statelessComponent: __React.StatelessComponent<P2>): CommonWrapper<P2, Any>
    fun closest(props: EnzymePropSelector): CommonWrapper<Any, Any>
    fun closest(selector: String): CommonWrapper<__React.HTMLAttributes, Any>
    fun text(): String
    fun html(): String
    fun get(index: Number): __React.ReactElement<Any>
    fun at(index: Number): CommonWrapper<P, S> /* this */
    fun first(): CommonWrapper<P, S> /* this */
    fun last(): CommonWrapper<P, S> /* this */
    fun state(): S
    fun state(key: String): Any
    fun <T> state(key: String): T
    fun context(key: String? = definedExternally /* null */): Any
    fun <T> context(key: String? = definedExternally /* null */): T
    fun props(): P
    fun prop(key: String): Any
    fun <T> prop(key: String): T
    fun key(): String
    fun simulate(event: String, vararg args: Any): CommonWrapper<P, S> /* this */
    fun setState(state: S, callback: (() -> Unit)? = definedExternally /* null */): CommonWrapper<P, S> /* this */
    fun setProps(props: P, callback: (() -> Unit)? = definedExternally /* null */): CommonWrapper<P, S> /* this */
    fun setContext(context: Any): CommonWrapper<P, S> /* this */
    fun instance(): __React.Component<P, S>
    fun update(): CommonWrapper<P, S> /* this */
    fun debug(): String
    fun type(): dynamic /* String | Function<*> */
    fun name(): String
    fun forEach(fn: (wrapper: CommonWrapper<P, S> /* this */) -> Any): CommonWrapper<P, S> /* this */
    fun <V> map(fn: (wrapper: CommonWrapper<P, S> /* this */) -> V): Array<V>
    fun <R> reduce(fn: (prevVal: R, wrapper: CommonWrapper<P, S> /* this */, index: Number) -> R, initialValue: R? = definedExternally /* null */): Array<R>
    fun <R> reduceRight(fn: (prevVal: R, wrapper: CommonWrapper<P, S> /* this */, index: Number) -> R, initialValue: R? = definedExternally /* null */): Array<R>
    fun some(selector: String): Boolean
    fun some(selector: __React.StatelessComponent<Any>): Boolean
    fun some(selector: __React.ComponentClass<Any>): Boolean
    fun some(selector: Json): Boolean
    fun someWhere(fn: (wrapper: CommonWrapper<P, S> /* this */) -> Boolean): Boolean
    fun every(selector: String): Boolean
    fun every(selector: __React.StatelessComponent<Any>): Boolean
    fun every(selector: __React.ComponentClass<Any>): Boolean
    fun every(selector: Json): Boolean
    fun everyWhere(fn: (wrapper: CommonWrapper<P, S> /* this */) -> Boolean): Boolean
    var length: Number
}
external interface ShallowWrapper<P, S> : CommonWrapper<P, S> {
    fun shallow(): ShallowWrapper<P, S>
    fun render(): CheerioWrapper<P, S>
    fun unmount(): ShallowWrapper<Any, Any>
    override fun <P2> find(component: __React.ComponentClass<P2>): ShallowWrapper<P2, Any>
    fun <P2> find(statelessComponent: (props: P2) -> JSX.Element): ShallowWrapper<P2, Any>
    override fun find(props: EnzymePropSelector): ShallowWrapper<Any, Any>
    override fun find(selector: String): ShallowWrapper<__React.HTMLAttributes, Any>
    override fun <P2> filter(component: __React.ComponentClass<P2>): ShallowWrapper<P2, Any>
    override fun <P2> filter(statelessComponent: __React.StatelessComponent<P2>): ShallowWrapper<P2, Any>
    override fun filter(props: EnzymePropSelector): ShallowWrapper<Any, Any>
    override fun filter(selector: String): ShallowWrapper<__React.HTMLAttributes, Any>
    override fun findWhere(predicate: (wrapper: CommonWrapper<Any, Any>) -> Boolean): ShallowWrapper<Any, Any>
    override fun <P2> children(component: __React.ComponentClass<P2>): ShallowWrapper<P2, Any>
    override fun <P2> children(statelessComponent: __React.StatelessComponent<P2>): ShallowWrapper<P2, Any>
    override fun children(props: EnzymePropSelector): ShallowWrapper<Any, Any>
    override fun children(selector: String): ShallowWrapper<__React.HTMLAttributes, Any>
    override fun children(): ShallowWrapper<Any, Any>
    override fun <P2, S2> childAt(index: Number): ShallowWrapper<P2, S2>
    fun <P2, S2> dive(options: ShallowRendererProps? = definedExternally /* null */): ShallowWrapper<P2, S2>
    override fun <P2> parents(component: __React.ComponentClass<P2>): ShallowWrapper<P2, Any>
    override fun <P2> parents(statelessComponent: __React.StatelessComponent<P2>): ShallowWrapper<P2, Any>
    override fun parents(props: EnzymePropSelector): ShallowWrapper<Any, Any>
    override fun parents(selector: String): ShallowWrapper<__React.HTMLAttributes, Any>
    override fun parents(): ShallowWrapper<Any, Any>
    override fun <P2> closest(component: __React.ComponentClass<P2>): ShallowWrapper<P2, Any>
    override fun <P2> closest(statelessComponent: __React.StatelessComponent<P2>): ShallowWrapper<P2, Any>
    override fun closest(props: EnzymePropSelector): ShallowWrapper<Any, Any>
    override fun closest(selector: String): ShallowWrapper<__React.HTMLAttributes, Any>
    override fun parent(): ShallowWrapper<Any, Any>
    fun isEmptyRender(): Boolean
}
external interface ReactWrapper<P, S> : CommonWrapper<P, S> {
    fun unmount(): ReactWrapper<Any, Any>
    fun mount(): ReactWrapper<Any, Any>
    fun render(): CheerioWrapper<P, S>
    fun ref(refName: String): ReactWrapper<Any, Any>
    fun <P2, S2> ref(refName: String): ReactWrapper<P2, S2>
    fun detach()
    override fun <P2> find(component: __React.ComponentClass<P2>): ReactWrapper<P2, Any>
    fun <P2> find(statelessComponent: (props: P2) -> JSX.Element): ReactWrapper<P2, Any>
    override fun find(props: EnzymePropSelector): ReactWrapper<Any, Any>
    override fun find(selector: String): ReactWrapper<__React.HTMLAttributes, Any>
    override fun findWhere(predicate: (wrapper: CommonWrapper<Any, Any>) -> Boolean): ReactWrapper<Any, Any>
    override fun <P2> filter(component: __React.ComponentClass<P2>): ReactWrapper<P2, Any>
    override fun <P2> filter(statelessComponent: __React.StatelessComponent<P2>): ReactWrapper<P2, Any>
    override fun filter(props: EnzymePropSelector): ReactWrapper<Any, Any>
    override fun filter(selector: String): ReactWrapper<__React.HTMLAttributes, Any>
    override fun <P2> children(component: __React.ComponentClass<P2>): ReactWrapper<P2, Any>
    override fun <P2> children(statelessComponent: __React.StatelessComponent<P2>): ReactWrapper<P2, Any>
    override fun children(props: EnzymePropSelector): ReactWrapper<Any, Any>
    override fun children(selector: String): ReactWrapper<__React.HTMLAttributes, Any>
    override fun children(): ReactWrapper<Any, Any>
    override fun <P2, S2> childAt(index: Number): ReactWrapper<P2, S2>
    override fun <P2> parents(component: __React.ComponentClass<P2>): ReactWrapper<P2, Any>
    override fun <P2> parents(statelessComponent: __React.StatelessComponent<P2>): ReactWrapper<P2, Any>
    override fun parents(props: EnzymePropSelector): ReactWrapper<Any, Any>
    override fun parents(selector: String): ReactWrapper<__React.HTMLAttributes, Any>
    override fun parents(): ReactWrapper<Any, Any>
    override fun <P2> closest(component: __React.ComponentClass<P2>): ReactWrapper<P2, Any>
    override fun <P2> closest(statelessComponent: __React.StatelessComponent<P2>): ReactWrapper<P2, Any>
    override fun closest(props: EnzymePropSelector): ReactWrapper<Any, Any>
    override fun closest(selector: String): ReactWrapper<__React.HTMLAttributes, Any>
    override fun parent(): ReactWrapper<Any, Any>
    fun isEmptyRender(): Boolean
}
external interface CheerioWrapper<P, S> : CommonWrapper<P, S>
external interface ShallowRendererProps {
    var lifecycleExperimental: Boolean? get() = definedExternally; set(value) = definedExternally
    var context: Any? get() = definedExternally; set(value) = definedExternally
}
external interface MountRendererProps {
    var context: Any? get() = definedExternally; set(value) = definedExternally
    var attachTo: HTMLElement? get() = definedExternally; set(value) = definedExternally
    var childContextTypes: Any? get() = definedExternally; set(value) = definedExternally
}
external fun <P, S> shallow(node: __React.ReactElement<P>, options: ShallowRendererProps? = definedExternally /* null */): ShallowWrapper<P, S> = definedExternally
external fun <P, S> mount(node: __React.ReactElement<P>, options: MountRendererProps? = definedExternally /* null */): ReactWrapper<P, S> = definedExternally
external fun <P, S> render(node: __React.ReactElement<P>, options: Any? = definedExternally /* null */): CheerioWrapper<P, S> = definedExternally
external fun describeWithDOM(description: String, fn: Function<*>): Unit = definedExternally
external fun spyLifecycle(component: Any?): Unit = definedExternally

external interface EnzymeOptions {
    var adapter: EnzymeAdapter
}

external interface EnzymeAdapter

external fun configure(configuration: EnzymeOptions)