package com.example.android_junior_test_matrenin.domain.usecase


import com.example.android_junior_test_matrenin.domain.repository.ScoreRepository
import org.junit.Assert
import org.junit.Test
import org.mockito.Mockito
import org.mockito.kotlin.mock

class BestScoreUseCaseTest {

    val mScoreRepository = mock<ScoreRepository>()

    @Test
    fun shouldReturnCorrectBestScore() {

        val testData = Int.MAX_VALUE
        Mockito.`when`(mScoreRepository.getScore()).thenReturn(testData)

        val useCase = BestScoreUseCase(scoreRepository = mScoreRepository)
        val actual = useCase.getBestScore()
        val expected = Int.MAX_VALUE
        Assert.assertEquals(expected, actual)
    }
}