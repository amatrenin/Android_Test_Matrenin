package com.example.android_junior_test_matrenin.domain.repository

interface ScoreRepository {

    fun getScore(): Int

    fun setScore(value: Int)
}