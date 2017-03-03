package com.akhilesh.learning

class ErrorController {

    def error() {
        render(view: "/error", model: [customMessage: "You have reached on error page."]);
    }
}
