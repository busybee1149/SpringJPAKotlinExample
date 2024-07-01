package com.spring.example.repository

import com.spring.example.repository.model.Treadmill

interface TreadmillRepository: CrudRepository<Treadmill, String> {
}