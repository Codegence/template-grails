/*
    Copyright (C) 2014  Gabriel Flores
    This file is part of Codegence.

    Codegence is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Codegence is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Codegence. If not, see <http://www.gnu.org/licenses/>.
*/

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
