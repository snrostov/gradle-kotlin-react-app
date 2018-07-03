# Gradle Kotlin React App template

To run build in _watch_ mode: `./gradlew -t run`, or use IDEA `watch` run configuration.
This will run:
 - Gradle in continuous mode
 - Web pack dev server at http://localhost:8088/
 - Karma at http://localhost:9876/
 
Build will be triggered on file changes and browser page will be reloaded.
 
To build application run `./gradlew build`, or use IDEA `build` run configuration. 

What's included:
  - `kotlin` 1.2.50
  - `kotlin-frontend-plugin` with configuration
  - `kotlin-react-dom`
  - `src/main/web/index.html` - Application index HTML page.
  - `src/main/kotlin/main.kt` - Application entry point.
  - `src/main/kotlin/App.kt` - React `App` component with State, Props and Kotlin React DSL function.
  - `src/test/kotlin/Test.kt` - Test.