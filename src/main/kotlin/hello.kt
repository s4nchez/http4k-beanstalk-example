import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status.Companion.OK
import org.http4k.server.SunHttp
import org.http4k.server.asServer

fun main(args: Array<String>) {
    { _: Request -> Response(OK).body("Hello World") }.asServer(SunHttp(5000)).start().block()
}