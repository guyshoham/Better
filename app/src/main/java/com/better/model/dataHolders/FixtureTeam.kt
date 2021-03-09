package com.better.model.dataHolders

/**
 * Represents a team as it stored in a specific fixture.
 * @property id (e.g. 33)
 * @property name (e.g. "Manchester United")
 * @property logo (e.g. "https://media.api-sports.io/football/teams/33.png")
 * @property winner boolean represent if the team won
 */
data class FixtureTeam(
    val id: Long,
    val name: String,
    val logo: String,
    val winner: Boolean?
)
