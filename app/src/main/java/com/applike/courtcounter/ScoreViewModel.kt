package com.applike.courtcounter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel(){
    private val _scoreTeamA = MutableLiveData(0)
    private val _scoreTeamB = MutableLiveData(0)

    val scoreTeamA: LiveData<Int> = _scoreTeamA
    val scoreTeamB: LiveData<Int> = _scoreTeamB

    fun addScore (score: Int, team: Char) {
        if (team.toLowerCase() == 'a') _scoreTeamA.value = (_scoreTeamA.value ?: 0).plus(score)
        else  _scoreTeamB.value = (_scoreTeamB.value ?: 0).plus(score)
    }

    fun resetScore() {
        _scoreTeamA.value = 0
        _scoreTeamB.value = 0
    }

    override fun onCleared() {
        super.onCleared()
    }
 }