// ------------------------------------------------------------------------------------------
@file:JsQualifier("JSX")
package JSX

import org.w3c.dom.*

external interface Element : __React.ReactElement<Any>
external interface ElementClass : __React.IComponent<Any, Any> {
    override fun render(): Element
}
external interface ElementAttributesProperty {
    var props: Any
}
external interface IntrinsicAttributes : __React.Attributes
external interface IntrinsicClassAttributes<T> : __React.ClassAttributes<T>
external interface IntrinsicElements {
    var a: __React.HTMLProps<HTMLAnchorElement>
    var abbr: __React.HTMLProps<HTMLElement>
    var address: __React.HTMLProps<HTMLElement>
    var area: __React.HTMLProps<HTMLAreaElement>
    var article: __React.HTMLProps<HTMLElement>
    var aside: __React.HTMLProps<HTMLElement>
    var audio: __React.HTMLProps<HTMLAudioElement>
    var b: __React.HTMLProps<HTMLElement>
    var base: __React.HTMLProps<HTMLBaseElement>
    var bdi: __React.HTMLProps<HTMLElement>
    var bdo: __React.HTMLProps<HTMLElement>
    var big: __React.HTMLProps<HTMLElement>
    var blockquote: __React.HTMLProps<HTMLElement>
    var body: __React.HTMLProps<HTMLBodyElement>
    var br: __React.HTMLProps<HTMLBRElement>
    var button: __React.HTMLProps<HTMLButtonElement>
    var canvas: __React.HTMLProps<HTMLCanvasElement>
    var caption: __React.HTMLProps<HTMLElement>
    var cite: __React.HTMLProps<HTMLElement>
    var code: __React.HTMLProps<HTMLElement>
    var col: __React.HTMLProps<HTMLTableColElement>
    var colgroup: __React.HTMLProps<HTMLTableColElement>
    var data: __React.HTMLProps<HTMLElement>
    var datalist: __React.HTMLProps<HTMLDataListElement>
    var dd: __React.HTMLProps<HTMLElement>
    var del: __React.HTMLProps<HTMLElement>
    var details: __React.HTMLProps<HTMLElement>
    var dfn: __React.HTMLProps<HTMLElement>
    var dialog: __React.HTMLProps<HTMLElement>
    var div: __React.HTMLProps<HTMLDivElement>
    var dl: __React.HTMLProps<HTMLDListElement>
    var dt: __React.HTMLProps<HTMLElement>
    var em: __React.HTMLProps<HTMLElement>
    var embed: __React.HTMLProps<HTMLEmbedElement>
    var fieldset: __React.HTMLProps<HTMLFieldSetElement>
    var figcaption: __React.HTMLProps<HTMLElement>
    var figure: __React.HTMLProps<HTMLElement>
    var footer: __React.HTMLProps<HTMLElement>
    var form: __React.HTMLProps<HTMLFormElement>
    var h1: __React.HTMLProps<HTMLHeadingElement>
    var h2: __React.HTMLProps<HTMLHeadingElement>
    var h3: __React.HTMLProps<HTMLHeadingElement>
    var h4: __React.HTMLProps<HTMLHeadingElement>
    var h5: __React.HTMLProps<HTMLHeadingElement>
    var h6: __React.HTMLProps<HTMLHeadingElement>
    var head: __React.HTMLProps<HTMLHeadElement>
    var header: __React.HTMLProps<HTMLElement>
    var hgroup: __React.HTMLProps<HTMLElement>
    var hr: __React.HTMLProps<HTMLHRElement>
    var html: __React.HTMLProps<HTMLHtmlElement>
    var i: __React.HTMLProps<HTMLElement>
    var iframe: __React.HTMLProps<HTMLIFrameElement>
    var img: __React.HTMLProps<HTMLImageElement>
    var input: __React.HTMLProps<HTMLInputElement>
    var ins: __React.HTMLProps<HTMLModElement>
    var kbd: __React.HTMLProps<HTMLElement>
    var keygen: __React.HTMLProps<HTMLElement>
    var label: __React.HTMLProps<HTMLLabelElement>
    var legend: __React.HTMLProps<HTMLLegendElement>
    var li: __React.HTMLProps<HTMLLIElement>
    var link: __React.HTMLProps<HTMLLinkElement>
    var main: __React.HTMLProps<HTMLElement>
    var map: __React.HTMLProps<HTMLMapElement>
    var mark: __React.HTMLProps<HTMLElement>
    var menu: __React.HTMLProps<HTMLElement>
    var menuitem: __React.HTMLProps<HTMLElement>
    var meta: __React.HTMLProps<HTMLMetaElement>
    var meter: __React.HTMLProps<HTMLElement>
    var nav: __React.HTMLProps<HTMLElement>
    var noscript: __React.HTMLProps<HTMLElement>
    var `object`: __React.HTMLProps<HTMLObjectElement>
    var ol: __React.HTMLProps<HTMLOListElement>
    var optgroup: __React.HTMLProps<HTMLOptGroupElement>
    var option: __React.HTMLProps<HTMLOptionElement>
    var output: __React.HTMLProps<HTMLElement>
    var p: __React.HTMLProps<HTMLParagraphElement>
    var param: __React.HTMLProps<HTMLParamElement>
    var picture: __React.HTMLProps<HTMLElement>
    var pre: __React.HTMLProps<HTMLPreElement>
    var progress: __React.HTMLProps<HTMLProgressElement>
    var q: __React.HTMLProps<HTMLQuoteElement>
    var rp: __React.HTMLProps<HTMLElement>
    var rt: __React.HTMLProps<HTMLElement>
    var ruby: __React.HTMLProps<HTMLElement>
    var s: __React.HTMLProps<HTMLElement>
    var samp: __React.HTMLProps<HTMLElement>
    var script: __React.HTMLProps<HTMLElement>
    var section: __React.HTMLProps<HTMLElement>
    var select: __React.HTMLProps<HTMLSelectElement>
    var small: __React.HTMLProps<HTMLElement>
    var source: __React.HTMLProps<HTMLSourceElement>
    var span: __React.HTMLProps<HTMLSpanElement>
    var strong: __React.HTMLProps<HTMLElement>
    var style: __React.HTMLProps<HTMLStyleElement>
    var sub: __React.HTMLProps<HTMLElement>
    var summary: __React.HTMLProps<HTMLElement>
    var sup: __React.HTMLProps<HTMLElement>
    var table: __React.HTMLProps<HTMLTableElement>
    var tbody: __React.HTMLProps<HTMLTableSectionElement>
//    var td: __React.HTMLProps<HTMLTableDataCellElement>
    var textarea: __React.HTMLProps<HTMLTextAreaElement>
    var tfoot: __React.HTMLProps<HTMLTableSectionElement>
//    var th: __React.HTMLProps<HTMLTableHeaderCellElement>
    var thead: __React.HTMLProps<HTMLTableSectionElement>
    var time: __React.HTMLProps<HTMLElement>
    var title: __React.HTMLProps<HTMLTitleElement>
    var tr: __React.HTMLProps<HTMLTableRowElement>
    var track: __React.HTMLProps<HTMLTrackElement>
    var u: __React.HTMLProps<HTMLElement>
    var ul: __React.HTMLProps<HTMLUListElement>
    var video: __React.HTMLProps<HTMLVideoElement>
    var wbr: __React.HTMLProps<HTMLElement>
    var svg: __React.SVGProps
    var circle: __React.SVGProps
    var clipPath: __React.SVGProps
    var defs: __React.SVGProps
    var desc: __React.SVGProps
    var ellipse: __React.SVGProps
    var feBlend: __React.SVGProps
    var feColorMatrix: __React.SVGProps
    var feComponentTransfer: __React.SVGProps
    var feComposite: __React.SVGProps
    var feConvolveMatrix: __React.SVGProps
    var feDiffuseLighting: __React.SVGProps
    var feDisplacementMap: __React.SVGProps
    var feDistantLight: __React.SVGProps
    var feFlood: __React.SVGProps
    var feFuncA: __React.SVGProps
    var feFuncB: __React.SVGProps
    var feFuncG: __React.SVGProps
    var feFuncR: __React.SVGProps
    var feGaussianBlur: __React.SVGProps
    var feImage: __React.SVGProps
    var feMerge: __React.SVGProps
    var feMergeNode: __React.SVGProps
    var feMorphology: __React.SVGProps
    var feOffset: __React.SVGProps
    var fePointLight: __React.SVGProps
    var feSpecularLighting: __React.SVGProps
    var feSpotLight: __React.SVGProps
    var feTile: __React.SVGProps
    var feTurbulence: __React.SVGProps
    var filter: __React.SVGProps
    var foreignObject: __React.SVGProps
    var g: __React.SVGProps
    var image: __React.SVGProps
    var line: __React.SVGProps
    var linearGradient: __React.SVGProps
    var marker: __React.SVGProps
    var mask: __React.SVGProps
    var metadata: __React.SVGProps
    var path: __React.SVGProps
    var pattern: __React.SVGProps
    var polygon: __React.SVGProps
    var polyline: __React.SVGProps
    var radialGradient: __React.SVGProps
    var rect: __React.SVGProps
    var stop: __React.SVGProps
    var switch: __React.SVGProps
    var symbol: __React.SVGProps
    var text: __React.SVGProps
    var textPath: __React.SVGProps
    var tspan: __React.SVGProps
    var use: __React.SVGProps
    var view: __React.SVGProps
}
