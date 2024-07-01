package com.spring.example.repository.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Treadmill(
    @Id
    var code: String,
    @Column
    var model: String
) {

    override fun toString(): String {
        return "Treadmill(code='$code', model='$model')"
    }
}