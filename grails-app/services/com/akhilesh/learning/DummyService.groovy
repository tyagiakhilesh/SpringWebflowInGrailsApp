package com.akhilesh.learning

import grails.transaction.Transactional

@Transactional
class DummyService {

    def serviceMethod() {
        println "I am hitting the service method."
    }
}
