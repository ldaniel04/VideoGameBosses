package com.example.videogamebosses.dataclass

import com.example.videogamebosses.R
import com.example.videogamebosses.model.Boss

class BossList{
    fun getBosses(): List<Boss>{
        return listOf(
            Boss(
                numBoss = 1,
                DescRes = R.string.desc_medusa,
                ImageRes = R.drawable.medusa,
                nameRes = R.string.medusa
            ),
            Boss(
                numBoss = 2,
                DescRes = R.string.desc_sigrun,
                ImageRes = R.drawable.sigrun,
                nameRes = R.string.sigrun
            ),
            Boss(
                numBoss = 3,
                DescRes = R.string.desc_godskin_duo,
                ImageRes = R.drawable.duo,
                nameRes = R.string.godskin_duo
            ),
            Boss(
                numBoss = 4,
                DescRes = R.string.desc_lady_dimitrescu,
                ImageRes = R.drawable.dimitrescus,
                nameRes = R.string.lady_dimitrescu
            ),
            Boss(
                numBoss = 5,
                DescRes = R.string.desc_garrador_duo,
                ImageRes = R.drawable.garrador,
                nameRes = R.string.garrador_duo
            ),
            Boss(
                numBoss = 6,
                DescRes = R.string.desc_mantis,
                ImageRes = R.drawable.mantis,
                nameRes = R.string.mantis
            ),
            Boss(
                numBoss = 7,
                DescRes = R.string.desc_lillith,
                ImageRes = R.drawable.lilith,
                nameRes = R.string.lillith
            ),
            Boss(
                numBoss = 8,
                DescRes = R.string.desc_octopus,
                ImageRes = R.drawable.doctor_octopus,
                nameRes = R.string.octopus
            ),
            Boss(
                numBoss = 9,
                DescRes = R.string.desc_shimano,
                ImageRes = R.drawable.shimano,
                nameRes = R.string.shimano
            ),
            Boss(
                numBoss = 10,
                DescRes = R.string.desc_jack_baker,
                ImageRes = R.drawable.jack_baker,
                nameRes = R.string.jack_baker
            )
        )
    }
}
