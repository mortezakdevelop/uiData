package com.example.data.utile

import com.example.domain.models.ViewDataModel
import com.example.domain.models.viewDataCat
import com.example.domain.models.viewDataItems
import com.example.domain.models.viewDataValues

object uidata {
    val uiData = listOf(
        ViewDataModel(
            1,
            "System Overview",
            listOf(
                viewDataCat(
                    "Cabinet",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("Temperature MMC (°c)", ""),
                                viewDataValues("MIP panel temperature (°c)", ""),
                                viewDataValues("Battery MMC (v)", ""),
                                viewDataValues("Battery starter (v)", ""),
                            )
                        )
                    )
                )
            )
        ),
        ViewDataModel(
            2,
            "Engine Overview",
            listOf(
                viewDataCat(
                    "Engine",
                    listOf(
                        viewDataItems(
                            "", listOf(
                                viewDataValues("Speed (rpm)", ""),
                                viewDataValues("Coolant engine inlet (°c)", ""),
                                viewDataValues("Coolant engine outlet (°c)", ""),
                                viewDataValues("Coolant press. engine inlet (bar)", ""),
                                viewDataValues("Coolant press. engine outlet (bar)", ""),
                                viewDataValues("Lube oil pressure (bar)", ""),
                                viewDataValues("Lube oil temperature (°c)", ""),
                                viewDataValues("Crankcase pressure (mbar)", ""),
                                viewDataValues("Average exhaust gas temp (°c)", ""),
                            )
                        )
                    )
                ),
                viewDataCat(
                    "Exhast Gas Temperature", listOf(
                        viewDataItems(
                            "Bank A", listOf(
                                viewDataValues("A1 (°c)", ""),
                                viewDataValues("A2 (°c)", ""),
                                viewDataValues("A3 (°c)", ""),
                                viewDataValues("A4 (°c)", ""),
                                viewDataValues("A5 (°c)", ""),
                                viewDataValues("A6 (°c)", ""),
                                viewDataValues("A7 (°c)", ""),
                                viewDataValues("A8 (°c)", ""),
                                viewDataValues("A9 (°c)", ""),
                                viewDataValues("A10 (°c)", ""),
                            )
                        ),
                        viewDataItems(
                            "Bank B", listOf(
                                viewDataValues("B1 (°c)", ""),
                                viewDataValues("B2 (°c)", ""),
                                viewDataValues("B3 (°c)", ""),
                                viewDataValues("B4 (°c)", ""),
                                viewDataValues("B5 (°c)", ""),
                                viewDataValues("B6 (°c)", ""),
                                viewDataValues("B7 (°c)", ""),
                                viewDataValues("B8 (°c)", ""),
                                viewDataValues("B9 (°c)", ""),
                                viewDataValues("B10 (°c)", ""),
                            )
                        )
                    )
                ),
                viewDataCat(
                    "Bank A", listOf(
                        viewDataItems(
                            "", listOf(
                                viewDataValues("T-Intake air A (°c)", ""),
                                viewDataValues("P-Intake air A (mbar)", ""),
                                viewDataValues("Exhaust gas temp.after turbine A (°c)", ""),
                            )
                        )
                    )
                ),
                viewDataCat(
                    "Bank B", listOf(
                        viewDataItems(
                            "", listOf(
                                viewDataValues("T-Intake air B (°c)", ""),
                                viewDataValues("P-Intake air B (mbar)", ""),
                                viewDataValues("Exhaust gas temp.after turbine B (°c)", ""),
                            )
                        )
                    )
                ),
                viewDataCat(
                    "Mixture", listOf(
                        viewDataItems(
                            "", listOf(
                                viewDataValues("T-Mixture A (°c)", ""),
                                viewDataValues("P-Mixture before throttle (bar)", ""),
                                viewDataValues("P-Mixture A (bar)", ""),
                                viewDataValues("P-Mixture B (bar)", ""),
                                viewDataValues("Mixture throttle position A (%)", ""),
                                viewDataValues("Mixture throttle position B (%)", ""),
                                viewDataValues("Mixture throttle position bypass (%)", ""),
                            )
                        )
                    )
                ),
                viewDataCat(
                    "Power Controller", listOf(
                        viewDataItems(
                            "", listOf(
                                viewDataValues("Sollwert (%)", ""),
                            )
                        ),
                        viewDataItems(
                            "Actual Value", listOf(
                                viewDataValues("%", ""),
                                viewDataValues("KW", ""),

                                )
                        )
                    )
                )
            )
        ),
        ViewDataModel(
            3,
            "Electrical Data",
            listOf(
                viewDataCat(
                    "",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("L1 (A)", ""),
                                viewDataValues("L2 (A)", ""),
                                viewDataValues("L3 (A)", ""),
                                viewDataValues("L1/L2 (V)", ""),
                                viewDataValues("L3/L1 (V)", ""),
                                viewDataValues("L3/L1 (V)", ""),
                                viewDataValues("Frequency (Hz)", "")
                            )
                        )
                    )
                )
            )
        ),
        ViewDataModel(
            4,
            "Generator Data",
            listOf(
                viewDataCat(
                    "Generator Winding",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues(
                                    "U1 (°c)",
                                    ""
                                ),
                                viewDataValues(
                                    "v1 (°c)",
                                    ""
                                ),
                                viewDataValues(
                                    "w1 (°c)",
                                    ""
                                )
                            )
                        )
                    ),


                    ),
                viewDataCat(
                    "Bearing Temperature",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues(
                                    "Drive end (°c)",
                                    ""
                                ),
                                viewDataValues(
                                    "Non drive end (°c)",
                                    ""
                                )

                            )
                        )
                    )
                )

            )
        ),
        ViewDataModel(
            5,
            "Power measurement module",
            listOf(
                viewDataCat(
                    "Synchronisation",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("Diff.angle (°)", ""),
                                viewDataValues("Diff.voltage (V)", ""),

                                )
                        )
                    )

                ),

                viewDataCat(
                    "Power",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("P (KW)", ""),
                                viewDataValues("Q (KVAr)", ""),
                                viewDataValues("p.f.", ""),
                                viewDataValues("S (KVA)", "")
                            )
                        )
                    )

                ),
                viewDataCat(
                    "Overview",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("Voltage 12 - Generator (V)", ""),
                                viewDataValues("Voltage 23 - Generator (V)", ""),
                                viewDataValues("Voltage 31 - Generator (V)", ""),
                                viewDataValues("Frequency - Generator (Hz)", ""),
                                viewDataValues("Voltage 12 - Bus bar (V)", ""),
                                viewDataValues("Voltage 23 - Bus bar (V)", ""),
                                viewDataValues("Voltage 31 - Bus bar (V)", ""),
                                viewDataValues("Frequency - Mains (Hz)", ""),
                            )
                        )
                    )
                ),
                viewDataCat(
                    "",
                    listOf(
                        viewDataItems(
                            "Overview",
                            listOf(
                                viewDataValues("Sync-mode", ""),
                                viewDataValues("Switch-on-pulse", "")
                            )
                        )
                    )
                )


            )
        ),
        ViewDataModel(
            6,
            "Water System",
            listOf(
                viewDataCat(
                    "",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("Mixture water temperature outlet (°c)", ""),
                                viewDataValues("Mixture water temperature inlet (°c)", ""),
                                viewDataValues("Control valve (%)", ""),
                                viewDataValues("Coolant engine inlet (°c)", ""),
                                viewDataValues("Coolant engine outlet (°c)", ""),
                                viewDataValues("P-Coolant Diff (bar)", ""),
                            )
                        )
                    )
                )
            )
        ),
        ViewDataModel(
            7,
            "Gas System",
            listOf(
                viewDataCat(
                    "",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("Gas temperature (°c)", ""),
                                viewDataValues("Gas pressure inlet (abs) (Kpa)", ""),
                                viewDataValues("Actual Tecjet position (%)", "")
                            )
                        )
                    )
                )
            )
        ),
        ViewDataModel(
            8,
            "Lube Oil System",
            listOf(
                viewDataCat(
                    "",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("Lube oil pressure (bar)", ""),
                                viewDataValues("Lube oil temperature (°c)", ""),
                                viewDataValues("Oil refill counter", ""),
                                viewDataValues("Oil refill counter", ""),
                                viewDataValues("Oil refill counter", ""),

                                )
                        )
                    )
                )

            )
        ),
        ViewDataModel(
            9,
            "Power Controller",
            listOf(
                viewDataCat(
                    "",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("L1", ""),
                                viewDataValues("p.f.", ""),
                                viewDataValues("KW", ""),
                                viewDataValues("%", ""),
                            )
                        )
                    )
                )
            )
        ),
        ViewDataModel(
            10,
            "Counter Reading",
            listOf(
                viewDataCat(
                    "",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("Start counter", ""),
                                viewDataValues("Operating hours (h)", ""),
                                viewDataValues("Active energy (KWh)", ""),
                                viewDataValues("Switching cycle GCB", "")
                            )
                        )
                    )
                )
            )
        ),
        ViewDataModel(
            11,
            "Water tepmerature controller",
            listOf(
                viewDataCat(
                    "",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("Setpoint (°c)", ""),
                                viewDataValues("Actual value (°c)", ""),
                                viewDataValues("Control variable (%)", ""),
                            )
                        )
                    )
                )
            )
        ),

        ViewDataModel(
            12,
            "Mixture water controller",
            listOf(
                viewDataCat(
                    "",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("Setpoint (°c)", ""),
                                viewDataValues("Actual value (°c)", ""),
                                viewDataValues("Control variable (%)", ""),
                            )
                        )
                    )
                )
            )
        ),
        ViewDataModel(
            13,
            "Mixture cooler and pump",
            listOf(
                viewDataCat(
                    "1",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("on or off", ""),
                                viewDataValues("Value to switch on (°c)", ""),
                                viewDataValues("Switch-on delay (s)", ""),
                                viewDataValues("Value to switch off (°c)", ""),
                                viewDataValues("Switch-off delay (s)", "")
                            )

                        )
                    )
                ),
                viewDataCat(
                    "2",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("on or off", ""),
                                viewDataValues("Value to switch on (°c)", ""),
                                viewDataValues("Switch-on delay (s)", ""),
                                viewDataValues("Value to switch off (°c)", ""),
                                viewDataValues("Switch-off delay (s)", "")
                            )

                        )
                    )
                ),
                viewDataCat(
                    "",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("Mixture water temperature inlet (°c)", ""),
                                viewDataValues("Mixture water temperature outlet (°c)", ""),
                                viewDataValues("Mixture cooling water after cooler (°c)", "")
                            )
                        )
                    )
                ),

                ),
        ),
        ViewDataModel(
            14,
            title = "Emergency cooler and pump",
            listOf(
                viewDataCat(
                    "1",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("on or off", "")

                            )
                        )
                    )
                ),

                viewDataCat(
                    "1",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("Value to switch on (°c)", ""),
                                viewDataValues("Value to switch on (°c)", ""),
                                viewDataValues("Switch-on delay (s)", ""),
                                viewDataValues("Value to switch off (°c)", ""),
                                viewDataValues("Switch-off delay (s)", ""),
                            )
                        )
                    )
                ),

                viewDataCat(
                    "2",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("Value to switch on (°c)", ""),
                                viewDataValues("Value to switch on (°c)", ""),
                                viewDataValues("Switch-on delay (s)", ""),
                                viewDataValues("Value to switch off (°c)", ""),
                                viewDataValues("Switch-off delay (s)", ""),
                            )
                        )
                    )
                ),

                viewDataCat(
                    "3",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("Value to switch on (°c)", ""),
                                viewDataValues("Value to switch on (°c)", ""),
                                viewDataValues("Switch-on delay (s)", ""),
                                viewDataValues("Value to switch off (°c)", ""),
                                viewDataValues("Switch-off delay (s)", ""),
                            )
                        )
                    )
                ),

                viewDataCat(
                    "4",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("Value to switch on (°c)", ""),
                                viewDataValues("Value to switch on (°c)", ""),
                                viewDataValues("Switch-on delay (s)", ""),
                                viewDataValues("Value to switch off (°c)", ""),
                                viewDataValues("Switch-off delay (s)", ""),
                            )
                        )
                    )
                ),

                viewDataCat(
                    "",
                    listOf(
                        viewDataItems(
                            "",
                            listOf(
                                viewDataValues("Actual value (°c)", ""),

                                )
                        )
                    )
                ),


                )
        ),
        ViewDataModel(
            15,
            "Room air fans",
            listOf(
                viewDataCat(
                    "1",
                    listOf(
                        viewDataItems(
                            "", listOf(
                                viewDataValues("on or off", ""),
                                viewDataValues("Value to switch on (°c)", ""),
                                viewDataValues("oSwitch-on delay (s)", ""),
                                viewDataValues("Value to switch off (°c)", ""),
                                viewDataValues("Switch-off delay (s)", ""),

                                )
                        )
                    )
                ),
                viewDataCat(
                    "",
                    listOf(
                        viewDataItems(
                            "", listOf(
                                viewDataValues("Room air (°c)", ""),

                                )
                        )
                    )
                ),

                )
        ),
        ViewDataModel(
            16,
            "Service Menu",
            listOf(
                viewDataCat(
                    "System Overview",
                    listOf(
                        viewDataItems("",
                        listOf(
                            viewDataValues("ECU Pow.Supp Volt (V)",""),
                            viewDataValues("L2L T-Exhaust (°c)  ",""),
                            viewDataValues("L1L T-Exhaust (°c)",""),
                            viewDataValues("U1L T-Exhaust (°c)",""),
                            viewDataValues("U2L T-Exhaust (°c)",""),



                        ))
                    )
                )
            )
        )
    )

}

