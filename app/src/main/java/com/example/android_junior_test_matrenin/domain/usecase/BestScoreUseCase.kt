package com.example.android_junior_test_matrenin.domain.usecase

import com.example.android_junior_test_matrenin.domain.repository.ScoreRepository
import javax.inject.Inject

class BestScoreUseCase @Inject constructor(
    private val scoreRepository: ScoreRepository,
) {
    fun getBestScore(): Int {
        return scoreRepository.getScore()
    }


    fun setBestScore(value: Int) {
        scoreRepository.setScore(value)
    }
}