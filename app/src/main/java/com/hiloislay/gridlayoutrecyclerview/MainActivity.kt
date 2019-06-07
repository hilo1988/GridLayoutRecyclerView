package com.hiloislay.gridlayoutrecyclerview

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.android.flexbox.FlexboxLayoutManager
import com.hiloislay.gridlayoutrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var adapter: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.activity_main, null, false)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = FlexboxLayoutManager(this)
        binding.recyclerView.adapter = MyAdapter(this, words)


    }


    val words = listOf(
        "zodroek",
        "troigrae",
        "rietharsphaokr",
        "qwermeu",
        "ploishaugr",
        "sastor",
        "wrou",
        "lyklirsph",
        "pocoi",
        "twiostopriapl",
        "tbohkwue",
        "swathiosluap",
        "beutwootba",
        "gurdy",
        "bluidosb",
        "breoshaegao",
        "siocho",
        "dleost",
        "dwaesbea",
        "smiapou",
        "glirdweetheaz",
        "frietwook",
        "beuspedrurth",
        "glurfraushaur",
        "slirklerst",
        "sphootheu",
        "slaetaesweudr",
        "perial",
        "carheakreuj",
        "qarqwautwoeqw",
        "dwuatbergr",
        "saobliukleu",
        "neuter",
        "pyeujo",
        "goosieneow",
        "kworkarv",
        "sphortreiqw",
        "turprurtieg",
        "sneegreufr",
        "snuigeo",
        "xaostoowrir",
        "whertordyfr",
        "bord",
        "fuekoiheiq",
        "pyuikwia",
        "dreedweost",
        "droedwohqw",
        "stopy",
        "laeqwuethea",
        "kliesboo",
        "qwiod",
        "sphegr",
        "bleaqwuepr",
        "flazeuk",
        "laudrietleasb",
        "druipuismerkr",
        "whiathoa",
        "pirshioby",
        "kworshec",
        "koofloam",
        "tormiupl",
        "chiatriagr",
        "neigrurvien",
        "snakliedl",
        "vaesosphoadw",
        "muetharsohst",
        "byuaworspa",
        "chervaeq",
        "broefroapyar",
        "drarcy",
        "keagleaj",
        "zygreo",
        "chirtlia",
        "pyohfrao",
        "tweebyea",
        "jeebl",
        "klycr",
        "sphohblohfrysp",
        "sber",
        "trocriotloj",
        "whovaoqur",
        "sheageucleo",
        "spoabyeu",
        "thiuskeb",
        "shysnirsl",
        "brurpyaequa",
        "kuigouw",
        "trerdriosbaudw",
        "croesnacl",
        "yeog",
        "flarqosen",
        "byeuyua",
        "flue",
        "presn",
        "byiucoa",
        "priusheudrirkr",
        "thasp",
        "grotheukw",
        "ploidraother",
        "sphouriavae"
    )


}
