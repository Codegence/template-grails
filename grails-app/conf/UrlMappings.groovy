class UrlMappings {

	static mappings = {
        //"/$controller/$action?/$id?(.$format)?"{
        //    constraints {
        //        // apply constraints here
        //    }
        //}
		"/info" (resources:"main") 
		"/sectors" (resources:"sectors") {
			"/factions" (resources:"factions") {
				"/recyclers" (resources:"recyclers")
				"/drones" (resources:"drones")
				"/terminators" (resources:"terminators")
			}
		}	
        "500"(view:'/error')
	}
}
