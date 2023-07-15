package ru.steelwave.unonew.domain.useCase.game

import ru.steelwave.unonew.domain.repository.GameRepository

class GetGameUseCase(private val repository: GameRepository) {
    operator fun invoke(gameId: Int) = repository.getGame(gameId)

}