package com.codegence

import grails.converters.JSON

class RecyclersController {

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
		def command = [ command: "newDrone", value : 0 ]
		render command as JSON
	}
	
	def update() {
		println "event params: " + params + request.JSON
		Random rand = new Random();
		def temp = rand.nextInt(9)
		def command
		if(temp < 5)
			command = [ command: "newDrone", value : 0 ]
		else
			command = [ command: "newTerminator", value : 0 ]
		render command as JSON
	}
	
	def delete() {
		println "died params: " + params
		render "died!!!"
	}
}
