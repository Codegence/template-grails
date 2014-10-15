package com.codegence

import grails.converters.JSON

class MainController {

    def show() {
		println "show main"
		def version = [ version: "1.1.0" ]
		render version as JSON
	}
}
