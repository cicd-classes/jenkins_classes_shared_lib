def call(msg, color) {

    if ( color == 'red' ) {
        println("\033[0;31m${msg}\033[0m")
    } else {
        println("\033[0;32m${msg}\033[0m")
    }
}