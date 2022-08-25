package com.example.android_junior_test_matrenin.domain.repository

import com.example.android_junior_test_matrenin.data.NumberData

interface ScoreRepository {

    fun getScore(): NumberData

    fun setScore(value: Int)
}