package com.codegence

import grails.converters.JSON

class DronesController {

    def index() { 
		println "index params: " + params
		render "index!!!"
	}
	
	def show() {
		println "echo params: " + params
		render "get by id!!"
	}
	
	def save() {
		println "born params: " + params + request.JSON
		def command = [ command: "advance", value : 10 ]
		render command  as JSON
	}
	
	def update() {
		println "event params: " + params + request.JSON
		Random rand = new Random();
		def temp = rand.nextInt(9)
		def command
		if(temp < 5)
			command = [ command: "advance", value : 20 ]
		else 
			command = [ command: "rotate", value : 2 ]
		render command  as JSON
	}
	
	def delete() {
		println "died params: " + params
		render "died!!!"
	}
}
