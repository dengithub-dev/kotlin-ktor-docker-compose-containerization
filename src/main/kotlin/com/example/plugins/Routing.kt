package com.example.plugins

import com.example.controller.APIController
import io.ktor.http.*
import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        get("/") {
            val getAccessMessageValueFromController = APIController().accessTestMessage()
            call.respondText("Hello World! $getAccessMessageValueFromController")
        }

        get("/{name}") {
            val name = call.parameters["name"] ?: return@get call.respondText(
                "Missing username.",
                status = HttpStatusCode.BadRequest
            )
            val getAccessNameValueFromController = APIController().accessName(name)
            call.respondText(getAccessNameValueFromController)
        }
    }
}
