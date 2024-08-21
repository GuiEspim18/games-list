package br.com.fiap.gameslist.repository

import br.com.fiap.gameslist.model.Game

fun getAllGames(): List<Game> {
    return listOf(
        Game(id = 1, title = "Minecraft", studio = "Mojang", releaseYear = 2010),
        Game(id = 2, title = "Call of Duty WW2", studio = "Sledgehammer Games", releaseYear = 2017),
        Game(id = 3, title = "Fortnite", studio = "Epic Games", releaseYear = 2017),
        Game(id = 4, title = "Forza Horizon 5", studio = "Palyground Games", releaseYear = 2021),
        Game(id = 5, title = "The Elder Scrolls: Skyrim", studio = "Bethesda Games", releaseYear = 2011),
        Game(id = 6, title = "Fallout 4", studio = "Bethesda Games", releaseYear = 2015),
    )
}

fun getGameByStudio(studio: String): List<Game> {
    return getAllGames().filter {
        it.studio.startsWith(prefix = studio, ignoreCase = true)
    }
}