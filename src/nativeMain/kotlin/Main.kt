//import kotlinx.coroutines.runBlocking

fun main()
{
	println("Application started")
	
//	runBlocking {
//		val client = HttpClient()
//
//		val response = client.request<HttpResponse>("https://www.google.com/")
//
//		println(response.content.readUTF8Line())
		
//		val runtimeUrl = "https://${getenv("AWS_LAMBDA_RUNTIME_API")!!.toKString()}/2018-06-01/runtime"
//		while (true) {
//			val invocation: HttpResponse = client.request("$runtimeUrl/invocation/next") {
//				method = HttpMethod.Get
//			}
//
//			val invocationId = invocation.headers["Lambda-Runtime-Aws-Request-Id"]
//			println("received invoke with id $invocationId")
//
//			client.request<HttpResponse>("$runtimeUrl/invocation/$invocationId/response") {
//				method = HttpMethod.Post
//				body = TextContent(
//					"""{"statusCode": 307, "headers": {"Location": "https://google.com"}}""",
//					Application.Json
//				)
//			}
//		}
//	}
	
	println("Application terminated")
}
