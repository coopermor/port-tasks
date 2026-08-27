package com.nucleon.porttasks.enums;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum TaskReward
{
	TASK_4966(4966, 4921), // Void Knights' Outpost clothes delivery
	TASK_4967(4967, 9842), // Rellekka arrowtip delivery
	TASK_8664(8664, 78), // Pandemonium platebody delivery
	TASK_8665(8665, 155), // Port Sarim spice delivery
	TASK_8666(8666, 79), // Musa Point logs delivery
	TASK_8667(8667, 158), // Port Sarim logs delivery
	TASK_8668(8668, 289), // Catherby bait delivery
	TASK_8669(8669, 578), // Port Sarim honey delivery
	TASK_8670(8670, 78), // Pandemonium battleaxe delivery
	TASK_8671(8671, 99), // Musa Point fish delivery
	TASK_8672(8672, 323), // Catherby potato delivery
	TASK_8673(8673, 300), // Ardougne salamander delivery
	TASK_8674(8674, 601), // Port Sarim seed delivery
	TASK_8675(8675, 353), // Port Khazard swamp paste delivery
	TASK_8676(8676, 705), // Port Sarim sword delivery
	TASK_8677(8677, 262), // Brimhaven vodka delivery
	TASK_8678(8678, 554), // Port Sarim delivery of nothing sinister
	TASK_8679(8679, 1011), // Port Piscarilius book delivery
	TASK_8680(8680, 655), // Ruin of Unkah rune delivery
	TASK_8681(8681, 6521), // Rellekka pie delivery
	TASK_8682(8682, 2500), // Port Sarim pest remains delivery
	TASK_8683(8683, 78), // Port Sarim jewellery delivery
	TASK_8684(8684, 155), // Pandemonium steel delivery
	TASK_8685(8685, 89), // Musa Point rotten banana delivery
	TASK_8686(8686, 178), // Pandemonium rum delivery
	TASK_8687(8687, 300), // Brimhaven jewellery delivery
	TASK_8688(8688, 601), // Pandemonium pineapple delivery
	TASK_8689(8689, 78), // Port Sarim fish delivery
	TASK_8690(8690, 99), // Musa Point ship part delivery
	TASK_8691(8691, 304), // Brimhaven cacti delivery
	TASK_8692(8692, 296), // Catherby grog delivery
	TASK_8693(8693, 592), // Pandemonium arrowtip delivery
	TASK_8694(8694, 655), // Corsair Cove scimitar delivery
	TASK_8695(8695, 1309), // Pandemonium gold delivery
	TASK_8696(8696, 377), // Port Khazard kyatt teeth delivery
	TASK_8697(8697, 755), // Pandemonium swamp paste delivery
	TASK_8698(8698, 308), // Ruin of Unkah cocktail delivery
	TASK_8699(8699, 693), // Pandemonium granite delivery
	TASK_8700(8700, 681), // Cairn Isle secret delivery
	TASK_8701(8701, 130), // Ardougne sand delivery
	TASK_8702(8702, 79), // Port Sarim coconut delivery
	TASK_8703(8703, 158), // Musa Point banana delivery
	TASK_8704(8704, 89), // Pandemonium banana delivery
	TASK_8705(8705, 178), // Musa Point eye patch delivery
	TASK_8706(8706, 169), // Brimhaven rum delivery
	TASK_8707(8707, 339), // Musa Point mahogany delivery
	TASK_8708(8708, 88), // Port Sarim logs delivery
	TASK_8709(8709, 110), // Pandemonium rum delivery
	TASK_8710(8710, 197), // Brimhaven silver delivery
	TASK_8711(8711, 193), // Catherby coconut delivery
	TASK_8712(8712, 413), // Musa Point honey delivery
	TASK_8713(8713, 185), // Entrana banana delivery
	TASK_8714(8714, 371), // Musa Point beer glass delivery
	TASK_8715(8715, 223), // Ardougne banana delivery
	TASK_8716(8716, 416), // Musa Point silk delivery
	TASK_8717(8717, 909), // Corsair Cove peg leg delivery
	TASK_8718(8718, 1001), // Summer Shore banana delivery
	TASK_8719(8719, 4191), // Port Tyras snakeskin delivery
	TASK_8720(8720, 541), // Musa Point secret delivery
	TASK_8721(8721, 289), // Port Sarim flax delivery
	TASK_8722(8722, 578), // Catherby bait delivery
	TASK_8723(8723, 69), // Ardougne fish delivery
	TASK_8724(8724, 308), // Catherby arrowtip delivery
	TASK_8725(8725, 197), // Port Khazard bow delivery
	TASK_8726(8726, 394), // Catherby glassmaking supplies delivery
	TASK_8727(8727, 323), // Port Sarim beer delivery
	TASK_8728(8728, 147), // Ardougne poison delivery
	TASK_8729(8729, 241), // Port Khazard coal delivery
	TASK_8730(8730, 130), // Entrana barley delivery
	TASK_8731(8731, 260), // Catherby vial delivery
	TASK_8732(8732, 296), // Pandemonium wax delivery
	TASK_8733(8733, 591), // Catherby coconut delivery
	TASK_8734(8734, 116), // Brimhaven fish delivery
	TASK_8735(8735, 231), // Catherby karambwan delivery
	TASK_8736(8736, 206), // Musa Point lobster delivery
	TASK_8737(8737, 413), // Catherby banana delivery
	TASK_8738(8738, 1078), // Port Piscarilius honey delivery
	TASK_8739(8739, 3147), // Catherby javelin delivery
	TASK_8740(8740, 185), // Musa Point cocktail delivery
	TASK_8741(8741, 339), // Brimhaven fish delivery
	TASK_8742(8742, 107), // Port Khazard spear delivery
	TASK_8743(8743, 246), // Brimhaven iron delivery
	TASK_8744(8744, 720), // Corsair Cove sword delivery
	TASK_8745(8745, 1246), // Brimhaven gem delivery
	TASK_8746(8746, 180), // Musa Point meat delivery
	TASK_8747(8747, 157), // Port Khazard fruit delivery
	TASK_8748(8748, 808), // Corsair Cove beer delivery
	TASK_8749(8749, 285), // Pandemonium meat delivery
	TASK_8750(8750, 601), // Brimhaven spice delivery
	TASK_8751(8751, 131), // Catherby pineapple delivery
	TASK_8752(8752, 231), // Brimhaven compost delivery
	TASK_8753(8753, 1597), // Red Rock karambwan delivery
	TASK_8755(8755, 277), // Port Sarim amulet delivery
	TASK_8756(8756, 69), // Ardougne fish delivery
	TASK_8757(8757, 945), // Civitas illa Fortis pineapple delivery
	TASK_8758(8758, 3502), // Brimhaven camphor delivery
	TASK_8759(8759, 69), // Brimhaven spice delivery
	TASK_8760(8760, 139), // Ardougne gold delivery
	TASK_8761(8761, 139), // Catherby fur delivery
	TASK_8762(8762, 277), // Ardougne arrowtip delivery
	TASK_8763(8763, 3635), // Port Tyras platebody delivery
	TASK_8764(8764, 7116), // Ardougne meat delivery
	TASK_8765(8765, 120), // Brimhaven beer delivery
	TASK_8766(8766, 164), // Catherby seed delivery
	TASK_8767(8767, 2323), // Port Tyras sword delivery
	TASK_8768(8768, 1051), // Port Piscarilius wine delivery
	TASK_8769(8769, 2068), // Ardougne fur delivery
	TASK_8770(8770, 1736), // Red Rock protective clothing delivery
	TASK_8771(8771, 1736), // Ardougne red coral delivery
	TASK_8772(8772, 99), // Port Khazard bread delivery
	TASK_8773(8773, 164), // Ardougne fish delivery
	TASK_8774(8774, 1866), // Summer Shore jewellery delivery
	TASK_8775(8775, 1046), // Civitas illa Fortis artefact delivery
	TASK_8776(8776, 1204), // Void Knights' Outpost platebody delivery
	TASK_8777(8777, 631), // Ardougne rune delivery
	TASK_8778(8778, 154), // Ardougne fish delivery
	TASK_8779(8779, 164), // Port Khazard platebody delivery
	TASK_8780(8780, 468), // Corsair Cove dagger delivery
	TASK_8781(8781, 872), // Port Khazard vodka delivery
	TASK_8782(8782, 369), // Port Sarim sword delivery
	TASK_8783(8783, 738), // Port Khazard swamp paste delivery
	TASK_8784(8784, 331), // Ardougne sand delivery
	TASK_8785(8785, 577), // Corsair Cove khali brew delivery
	TASK_8786(8786, 417), // Port Sarim fish delivery
	TASK_8787(8787, 180), // Catherby gold delivery
	TASK_8788(8788, 361), // Port Khazard secret delivery
	TASK_8789(8789, 945), // Civitas illa Fortis pineapple delivery
	TASK_8790(8790, 1926), // Port Khazard huasca delivery
	TASK_8791(8791, 982), // Ruin of Unkah ship part delivery
	TASK_8792(8792, 1962), // Port Khazard angler outfit delivery
	TASK_8793(8793, 5527), // Rellekka dragon bitter delivery
	TASK_8794(8794, 977), // Port Piscarilius platebody delivery
	TASK_8795(8795, 260), // Entrana sand delivery
	TASK_8796(8796, 246), // Port Khazard herb delivery
	TASK_8797(8797, 468), // Port Khazard scimitar delivery
	TASK_8798(8798, 872), // Corsair Cove platebody delivery
	TASK_8799(8799, 509), // Void Knights' Outpost dragonhide delivery
	TASK_8800(8800, 926), // Corsair Cove arrowtip delivery
	TASK_8801(8801, 2252), // Port Tyras herb delivery
	TASK_8802(8802, 4349), // Corsair Cove meat delivery
	TASK_8803(8803, 577), // Port Khazard gunpowder delivery
	TASK_8804(8804, 670), // Void Knights' Outpost rune delivery
	TASK_8805(8805, 7274), // Port Tyras sword delivery
	TASK_8806(8806, 1628), // Port Piscarilius jewellery delivery
	TASK_8807(8807, 2961), // Corsair Cove fish delivery
	TASK_8808(8808, 358), // Cairn Isle gold delivery
	TASK_8809(8809, 788), // Corsair Cove gem delivery
	TASK_8810(8810, 720), // Brimhaven jewellery delivery
	TASK_8811(8811, 1440), // Corsair Cove rum delivery
	TASK_8812(8812, 655), // Pandemonium spice delivery
	TASK_8813(8813, 1309), // Corsair Cove ship part delivery
	TASK_8814(8814, 1216), // Civitas illa Fortis book delivery
	TASK_8815(8815, 1751), // Aldarin dagger delivery
	TASK_8816(8816, 693), // Port Sarim cacti delivery
	TASK_8817(8817, 1386), // Ruin of Unkah rune delivery
	TASK_8818(8818, 789), // Summer Shore sandstone delivery
	TASK_8819(8819, 1655), // Ruin of Unkah coral delivery
	TASK_8820(8820, 926), // Red Rock granite delivery
	TASK_8821(8821, 1851), // Ruin of Unkah plank delivery
	TASK_8822(8822, 880), // Port Sarim kebab delivery
	TASK_8823(8823, 1509), // Summer Shore cacti delivery
	TASK_8824(8824, 1498), // Red Rock fish delivery
	TASK_8825(8825, 347), // Pandemonium cacti delivery
	TASK_8826(8826, 616), // Ruin of Unkah cocktail delivery
	TASK_8827(8827, 1088), // Void Knights' Outpost granite delivery
	TASK_8828(8828, 2175), // Ruin of Unkah javelin delivery
	TASK_8829(8829, 1116), // Ardougne silk delivery
	TASK_8830(8830, 2154), // Ruin of Unkah fishing supplies delivery
	TASK_8831(8831, 1295), // Brimhaven sandstone delivery
	TASK_8832(8832, 1116), // Catherby silk delivery
	TASK_8833(8833, 3914), // Deepfin Point granite delivery
	TASK_8834(8834, 1885), // Ruin of Unkah ship part delivery
	TASK_8835(8835, 625), // Red Rock rune delivery
	TASK_8836(8836, 1250), // Void Knights' Outpost herb delivery
	TASK_8837(8837, 1180), // Summer Shore pest remains delivery
	TASK_8838(8838, 2453), // Void Knights' Outpost logs delivery
	TASK_8839(8839, 2647), // Deepfin Point javelin delivery
	TASK_8840(8840, 5140), // Void Knights' Outpost ore delivery
	TASK_8841(8841, 1034), // Red Rock fish delivery
	TASK_8842(8842, 2360), // Summer Shore javelin delivery
	TASK_8843(8843, 2727), // Deepfin Point pest remains delivery
	TASK_8844(8844, 1295), // Port Sarim rune delivery
	TASK_8845(8845, 2500), // Void Knights' Outpost potion delivery
	TASK_8846(8846, 3218), // Civitas illa Fortis rune delivery
	TASK_8847(8847, 6302), // Void Knights' Outpost mace delivery
	TASK_8848(8848, 2176), // Port Roberts fish delivery
	TASK_8849(8849, 4258), // Void Knights' Outpost seed delivery
	TASK_8850(8850, 1018), // Port Khazard arrowtip delivery
	TASK_8851(8851, 2529), // Port Tyras arrowtip delivery
	TASK_8852(8852, 1574), // Catherby arrowtip delivery
	TASK_8853(8853, 1019), // Void Knights' Outpost potion delivery
	TASK_8854(8854, 789), // Ruin of Unkah calquat delivery
	TASK_8855(8855, 1577), // Summer Shore rope delivery
	TASK_8856(8856, 1226), // Void Knights' Outpost coral delivery
	TASK_8857(8857, 1710), // Summer Shore javelin delivery
	TASK_8858(8858, 1001), // Pandemonium coral delivery
	TASK_8859(8859, 2001), // Summer Shore gem delivery
	TASK_8860(8860, 1041), // Ruin of Unkah fish delivery
	TASK_8861(8861, 1710), // Void Knights' Outpost spear delivery
	TASK_8862(8862, 1250), // Pandemonium sea shell delivery
	TASK_8863(8863, 1347), // Port Sarim camphor delivery
	TASK_8864(8864, 2616), // Summer Shore shield delivery
	TASK_8865(8865, 2712), // Aldarin crab paste delivery
	TASK_8866(8866, 5348), // Summer Shore potion delivery
	TASK_8867(8867, 3078), // Port Roberts coral delivery
	TASK_8868(8868, 6155), // Summer Shore meat delivery
	TASK_8869(8869, 4230), // Deepfin Point camphor delivery
	TASK_8870(8870, 1462), // Port Khazard crab paste delivery
	TASK_8871(8871, 3285), // Civitas illa Fortis coral delivery
	TASK_8872(8872, 2001), // Summer Shore pineapple delivery
	TASK_8873(8873, 1319), // Port Khazard red coral delivery
	TASK_8874(8874, 2639), // Red Rock fish delivery
	TASK_8875(8875, 3319), // Deepfin Point plank delivery
	TASK_8876(8876, 6479), // Red Rock ore delivery
	TASK_8877(8877, 1319), // Port Sarim red coral delivery
	TASK_8878(8878, 2639), // Red Rock battleaxe delivery
	TASK_8879(8879, 1907), // Port Khazard plank delivery
	TASK_8880(8880, 3500), // Deepfin Point logs delivery
	TASK_8881(8881, 1840), // Port Sarim fish delivery
	TASK_8882(8882, 3513), // Port Roberts red coral delivery
	TASK_8883(8883, 7026), // Red Rock spice delivery
	TASK_8884(8884, 625), // Void Knights' Outpost ore delivery
	TASK_8885(8885, 1157), // Red Rock rune delivery
	TASK_8886(8886, 4564), // Port Piscarilius red coral delivery
	TASK_8887(8887, 9129), // Red Rock fish delivery
	TASK_8889(8889, 1736), // Ardougne red coral delivery
	TASK_8890(8890, 1805), // Catherby jewellery delivery
	TASK_8891(8891, 6716), // Red Rock fur delivery
	TASK_8892(8892, 91), // Hosidius rope delivery
	TASK_8893(8893, 183), // Land's End vegetable delivery
	TASK_8894(8894, 253), // Port Piscarilius plank delivery
	TASK_8895(8895, 506), // Land's End fish delivery
	TASK_8896(8896, 810), // Port Roberts berry delivery
	TASK_8897(8897, 1527), // Land's End wine delivery
	TASK_8898(8898, 91), // Hosidius fabric delivery
	TASK_8899(8899, 317), // Port Piscarilius fur delivery
	TASK_8900(8900, 1174), // Port Roberts meat delivery
	TASK_8901(8901, 2491), // Port Tyras chinchompa delivery
	TASK_8902(8902, 4823), // Land's End meat delivery
	TASK_8903(8903, 2526), // Prifddinas fabric delivery
	TASK_8904(8904, 4374), // Land's End gem delivery
	TASK_8905(8905, 3646), // Piscatoris fur delivery
	TASK_8906(8906, 2411), // Land's End fur delivery
	TASK_8907(8907, 1956), // Deepfin Point logs delivery
	TASK_8908(8908, 960), // Port Khazard chainbody delivery
	TASK_8909(8909, 3827), // Lunar Isle berry delivery
	TASK_8910(8910, 2961), // Land's End sword delivery
	TASK_8911(8911, 264), // Land's End fish delivery
	TASK_8912(8912, 506), // Port Piscarilius plank delivery
	TASK_8913(8913, 810), // Port Roberts fish delivery
	TASK_8914(8914, 1619), // Port Piscarilius gin delivery
	TASK_8915(8915, 2250), // Piscatoris fish delivery
	TASK_8916(8916, 4501), // Port Piscarilius fur delivery
	TASK_8917(8917, 330), // Land's End meat delivery
	TASK_8918(8918, 1174), // Port Roberts jewellery delivery
	TASK_8919(8919, 2161), // Piscatoris vodka delivery
	TASK_8920(8920, 193), // Hosidius fish delivery
	TASK_8921(8921, 385), // Port Piscarilius seed delivery
	TASK_8922(8922, 2025), // Lunar Isle fish delivery
	TASK_8923(8923, 4231), // Port Piscarilius book delivery
	TASK_8924(8924, 997), // Port Sarim book delivery
	TASK_8925(8925, 2022), // Port Piscarilius book delivery
	TASK_8926(8926, 2253), // Port Tyras fur delivery
	TASK_8927(8927, 990), // Musa Point important delivery
	TASK_8928(8928, 2316), // Rellekka beer delivery
	TASK_8929(8929, 4156), // Port Piscarilius gem delivery
	TASK_8930(8930, 1270), // Aldarin platebody delivery
	TASK_8931(8931, 2463), // Civitas illa Fortis orange delivery
	TASK_8932(8932, 453), // Port Piscarilius meat delivery
	TASK_8933(8933, 908), // Civitas illa Fortis vegetable delivery
	TASK_8934(8934, 486), // Port Roberts gem delivery
	TASK_8935(8935, 1064), // Civitas illa Fortis token delivery
	TASK_8936(8936, 1528), // Aldarin fur delivery
	TASK_8937(8937, 436), // Port Piscarilius jewellery delivery
	TASK_8938(8938, 772), // Port Roberts silk delivery
	TASK_8939(8939, 2175), // Deepfin Point wool delivery
	TASK_8940(8940, 4191), // Civitas illa Fortis ore delivery
	TASK_8941(8941, 2078), // Prifddinas clothes delivery
	TASK_8942(8942, 4156), // Civitas illa Fortis seed delivery
	TASK_8943(8943, 1147), // Sunset Coast mace delivery
	TASK_8944(8944, 2223), // Civitas illa Fortis fish delivery
	TASK_8945(8945, 2026), // Port Sarim sunbeam ale delivery
	TASK_8946(8946, 2025), // Ardougne spice delivery
	TASK_8947(8947, 2655), // Summer Shore leather delivery
	TASK_8949(8949, 212), // Sunset Coast beer delivery
	TASK_8950(8950, 424), // Aldarin fur delivery
	TASK_8951(8951, 1231), // Civitas illa Fortis fruit delivery
	TASK_8952(8952, 2463), // Aldarin spear delivery
	TASK_8953(8953, 1898), // Deepfin Point pickaxe delivery
	TASK_8954(8954, 3795), // Aldarin nickel delivery
	TASK_8955(8955, 347), // Sunset Coast wine delivery
	TASK_8956(8956, 1574), // Civitas illa Fortis gem delivery
	TASK_8957(8957, 2037), // Deepfin Point machinery delivery
	TASK_8958(8958, 1527), // Port Roberts wine delivery
	TASK_8959(8959, 3055), // Aldarin jewellery delivery
	TASK_8960(8960, 4072), // Prifddinas potion delivery
	TASK_8961(8961, 7082), // Aldarin dye delivery
	TASK_8962(8962, 2338), // Void Knights' Outpost potion delivery
	TASK_8963(8963, 4674), // Aldarin pest remains delivery
	TASK_8964(8964, 2686), // Port Tyras shield delivery
	TASK_8965(8965, 2406), // Brimhaven wine delivery
	TASK_8966(8966, 4707), // Rellekka wine delivery
	TASK_8967(8967, 10443), // Aldarin monkfish delivery
	TASK_8968(8968, 856), // Port Piscarilius cannonball delivery
	TASK_8969(8969, 2175), // Port Roberts fish delivery
	TASK_8970(8970, 486), // Civitas illa Fortis spice delivery
	TASK_8971(8971, 1064), // Port Roberts fur delivery
	TASK_8972(8972, 810), // Land's End ore delivery
	TASK_8973(8973, 1527), // Port Roberts seed delivery
	TASK_8974(8974, 1703), // Port Piscarilius jewellery delivery
	TASK_8975(8975, 705), // Civitas illa Fortis ship part delivery
	TASK_8976(8976, 1174), // Land's End secret delivery
	TASK_8977(8977, 1819), // Deepfin Point plank delivery
	TASK_8978(8978, 4033), // Port Roberts ore delivery
	TASK_8979(8979, 3015), // Lunar Isle fur delivery
	TASK_8980(8980, 6032), // Port Roberts rune delivery
	TASK_8981(8981, 4952), // Catherby silver delivery
	TASK_8982(8982, 9905), // Port Roberts honey delivery
	TASK_8983(8983, 5060), // Port Sarim seed delivery
	TASK_8984(8984, 2636), // Rellekka ship part delivery
	TASK_8985(8985, 3837), // Red Rock herb delivery
	TASK_8986(8986, 8112), // Port Roberts silk delivery
	TASK_8987(8987, 2094), // Port Roberts nickel delivery
	TASK_8988(8988, 4033), // Deepfin Point fabric delivery
	TASK_8989(8989, 1819), // Port Tyras mithril delivery
	TASK_8990(8990, 1954), // Deepfin Point logs delivery
	TASK_8991(8991, 1819), // Aldarin adamantite delivery
	TASK_8992(8992, 3795), // Deepfin Point fruit delivery
	TASK_8993(8993, 2157), // Port Roberts silver delivery
	TASK_8994(8994, 1875), // Port Tyras coal delivery
	TASK_8995(8995, 1956), // Aldarin lead delivery
	TASK_8996(8996, 2094), // Civitas illa Fortis nickel delivery
	TASK_8997(8997, 4349), // Deepfin Point wool delivery
	TASK_8998(8998, 3123), // Port Piscarilius coal delivery
	TASK_8999(8999, 6246), // Deepfin Point plank delivery
	TASK_9000(9000, 3961), // Red Rock coal delivery
	TASK_9001(9001, 7921), // Deepfin Point fabric delivery
	TASK_9002(9002, 4889), // Rellekka lead delivery
	TASK_9003(9003, 9605), // Deepfin Point warhammer delivery
	TASK_9004(9004, 2853), // Hosidius lead delivery
	TASK_9005(9005, 4997), // Summer Shore nickel delivery
	TASK_9006(9006, 1221), // Prifddinas logs delivery
	TASK_9007(9007, 2445), // Port Tyras vegetable delivery
	TASK_9008(9008, 1542), // Port Roberts fur delivery
	TASK_9009(9009, 3637), // Port Tyras platebody delivery
	TASK_9010(9010, 2016), // Deepfin Point plank delivery
	TASK_9011(9011, 1441), // Port Tyras ore delivery
	TASK_9012(9012, 1141), // Prifddinas halberd delivery
	TASK_9013(9013, 1620), // Port Roberts bow delivery
	TASK_9014(9014, 3637), // Deepfin Point logs delivery
	TASK_9015(9015, 3558), // Ardougne halberd delivery
	TASK_9016(9016, 3748), // Port Tyras sword delivery
	TASK_9017(9017, 2411), // Land's End fur delivery
	TASK_9018(9018, 4823), // Port Tyras seed delivery
	TASK_9019(9019, 2333), // Port Piscarilius plank delivery
	TASK_9020(9020, 4504), // Port Tyras fish delivery
	TASK_9021(9021, 3676), // Brimhaven meat delivery
	TASK_9022(9022, 3286), // Lunar Isle logs delivery
	TASK_9023(9023, 3460), // Red Rock ship part delivery
	TASK_9024(9024, 5534), // Port Tyras fruit delivery
	TASK_9025(9025, 1141), // Port Tyras fabric delivery
	TASK_9026(9026, 2279), // Prifddinas logs delivery
	TASK_9027(9027, 1671), // Port Roberts logs delivery
	TASK_9028(9028, 3175), // Prifddinas fish delivery
	TASK_9029(9029, 4482), // Ardougne crystal seed delivery
	TASK_9030(9030, 8801), // Prifddinas silk delivery
	TASK_9031(9031, 1440), // Port Tyras ore delivery
	TASK_9032(9032, 1846), // Port Roberts staff delivery
	TASK_9033(9033, 5131), // Ardougne jewellery delivery
	TASK_9034(9034, 6247), // Deepfin Point plank delivery
	TASK_9035(9035, 4721), // Prifddinas ore delivery
	TASK_9036(9036, 3545), // Aldarin crystal seed delivery
	TASK_9037(9037, 7082), // Prifddinas potion delivery
	TASK_9038(9038, 1996), // Civitas illa Fortis staff delivery
	TASK_9039(9039, 4156), // Prifddinas spice delivery
	TASK_9040(9040, 2746), // Lunar Isle crystal seed delivery
	TASK_9041(9041, 3134), // Rellekka plank delivery
	TASK_9042(9042, 3260), // Void Knights' Outpost rune delivery
	TASK_9043(9043, 4319), // Prifddinas book delivery
	TASK_9044(9044, 870), // Etceteria fish delivery
	TASK_9045(9045, 1738), // Rellekka teak delivery
	TASK_9046(9046, 1265), // Neitiznot coal delivery
	TASK_9047(9047, 2529), // Rellekka rope delivery
	TASK_9048(9048, 4778), // Sunset Coast warhammer delivery
	TASK_9049(9049, 9557), // Rellekka fabric delivery
	TASK_9050(9050, 978), // Etceteria warhammer delivery
	TASK_9051(9051, 1386), // Neitiznot sand delivery
	TASK_9052(9052, 5376), // Sunset Coast fish delivery
	TASK_9053(9053, 2708), // Port Roberts fish delivery
	TASK_9054(9054, 5278), // Rellekka plank delivery
	TASK_9055(9055, 1935), // Piscatoris fur delivery
	TASK_9056(9056, 3691), // Rellekka monkfish delivery
	TASK_9057(9057, 2245), // Port Piscarilius fur delivery
	TASK_9058(9058, 4494), // Rellekka redwood delivery
	TASK_9059(9059, 1107), // Jatizso logs delivery
	TASK_9060(9060, 2371), // Rellekka adamantite delivery
	TASK_9061(9061, 4583), // Deepfin Point fur delivery
	TASK_9062(9062, 6953), // Rellekka halberd delivery
	TASK_9063(9063, 869), // Rellekka fish delivery
	TASK_9064(9064, 1581), // Etceteria iron delivery
	TASK_9065(9065, 988), // Jatizso fish delivery
	TASK_9066(9066, 2135), // Etceteria adamantite delivery
	TASK_9067(9067, 3004), // Port Roberts teak delivery
	TASK_9068(9068, 6005), // Etceteria fruit delivery
	TASK_9069(9069, 977), // Rellekka teak delivery
	TASK_9070(9070, 1182), // Jatizso flax delivery
	TASK_9071(9071, 3175), // Port Roberts flax delivery
	TASK_9072(9072, 2569), // Port Piscarilius mahogany delivery
	TASK_9073(9073, 5294), // Etceteria plank delivery
	TASK_9074(9074, 1423), // Neitiznot mahogany delivery
	TASK_9075(9075, 2686), // Etceteria yak hair delivery
	TASK_9076(9076, 5294), // Sunset Coast fabric delivery
	TASK_9077(9077, 10587), // Etceteria sword delivery
	TASK_9078(9078, 1935), // Piscatoris flax delivery
	TASK_9079(9079, 4051), // Etceteria monkfish delivery
	TASK_9080(9080, 4662), // Deepfin Point mahogany delivery
	TASK_9081(9081, 6637), // Etceteria onion delivery
	TASK_9082(9082, 2025), // Port Piscarilius fabric delivery
	TASK_9083(9083, 4231), // Lunar Isle fish delivery
	TASK_9084(9084, 1575), // Piscatoris fabric delivery
	TASK_9085(9085, 3150), // Lunar Isle fur delivery
	TASK_9086(9086, 2746), // Prifddinas herb delivery
	TASK_9087(9087, 5491), // Lunar Isle potion delivery
	TASK_9088(9088, 2464), // Port Piscarilius rune delivery
	TASK_9089(9089, 1760), // Piscatoris potion delivery
	TASK_9090(9090, 3168), // Prifddinas rune delivery
	TASK_9091(9091, 4636), // Deepfin Point suqah hide delivery
	TASK_9092(9092, 9092), // Lunar Isle coal delivery
	TASK_9093(9093, 2926), // Port Roberts fabric delivery
	TASK_9094(9094, 5851), // Lunar Isle fish delivery
	TASK_9095(9095, 3781), // Civitas illa Fortis rune delivery
	TASK_9096(9096, 9337), // Lunar Isle fur delivery
	TASK_9097(9097, 6571), // Red Rock rune delivery
	TASK_9098(9098, 13143), // Lunar Isle red coral delivery
	TASK_9099(9099, 4374), // Land's End gem delivery
	TASK_9100(9100, 12671), // Lunar Isle potion delivery
	TASK_9101(9101, 3465), // Port Sarim tern bounty
	TASK_9102(9102, 3465), // Port Sarim mogre bounty
	TASK_9103(9103, 3465), // Port Sarim bull shark bounty
	TASK_9104(9104, 19910), // Port Sarim tiger shark bounty
	TASK_9105(9105, 3465), // Port Sarim osprey bounty
	TASK_9106(9106, 3465), // Port Sarim bull shark bounty
	TASK_9107(9107, 14575), // Port Sarim pygmy kraken bounty
	TASK_9108(9108, 3465), // Pandemonium bull shark bounty
	TASK_9109(9109, 3465), // Pandemonium mogre bounty
	TASK_9110(9110, 3465), // Pandemonium osprey bounty
	TASK_9111(9111, 8800), // Pandemonium butterfly ray bounty
	TASK_9112(9112, 3465), // Pandemonium tern bounty
	TASK_9113(9113, 8800), // Pandemonium hammerhead shark bounty
	TASK_9114(9114, 11825), // Pandemonium frigatebird bounty
	TASK_9115(9115, 3465), // Musa Point bull shark bounty
	TASK_9116(9116, 3465), // Musa Point mogre bounty
	TASK_9117(9117, 3465), // Musa Point tern bounty
	TASK_9118(9118, 8800), // Musa Point butterfly ray bounty
	TASK_9119(9119, 3465), // Musa Point eagle ray bounty
	TASK_9120(9120, 3465), // Musa Point bull shark bounty
	TASK_9121(9121, 8800), // Musa Point hammerhead shark bounty
	TASK_9122(9122, 3465), // Catherby tern bounty
	TASK_9123(9123, 3465), // Catherby osprey bounty
	TASK_9124(9124, 3465), // Catherby bull shark bounty
	TASK_9125(9125, 14575), // Catherby pygmy kraken bounty
	TASK_9126(9126, 3465), // Catherby mogre bounty
	TASK_9127(9127, 11825), // Catherby frigatebird bounty
	TASK_9128(9128, 14575), // Catherby albatross bounty
	TASK_9129(9129, 3465), // Brimhaven osprey bounty
	TASK_9130(9130, 3465), // Brimhaven tern bounty
	TASK_9131(9131, 3465), // Brimhaven bull shark bounty
	TASK_9132(9132, 14575), // Brimhaven albatross bounty
	TASK_9133(9133, 8800), // Brimhaven hammerhead shark bounty
	TASK_9134(9134, 19910), // Brimhaven tiger shark bounty
	TASK_9135(9135, 3465), // Brimhaven mogre bounty
	TASK_9136(9136, 3465), // Ardougne mogre bounty
	TASK_9137(9137, 3465), // Ardougne osprey bounty
	TASK_9138(9138, 3465), // Ardougne bull shark bounty
	TASK_9139(9139, 14575), // Ardougne pygmy kraken bounty
	TASK_9140(9140, 8800), // Ardougne hammerhead shark bounty
	TASK_9141(9141, 11825), // Ardougne stingray bounty
	TASK_9142(9142, 30965), // Ardougne spined kraken bounty
	TASK_9143(9143, 3465), // Port Khazard mogre bounty
	TASK_9144(9144, 3465), // Port Khazard bull shark bounty
	TASK_9145(9145, 8800), // Port Khazard hammerhead shark bounty
	TASK_9146(9146, 40370), // Port Khazard great white shark bounty
	TASK_9147(9147, 3465), // Port Khazard mogre bounty
	TASK_9148(9148, 3465), // Port Khazard eagle ray bounty
	TASK_9149(9149, 14575), // Port Khazard albatross bounty
	TASK_9150(9150, 8800), // Corsair Cove hammerhead shark bounty
	TASK_9151(9151, 14575), // Corsair Cove pygmy kraken bounty
	TASK_9152(9152, 3465), // Corsair Cove mogre bounty
	TASK_9153(9153, 11825), // Corsair Cove stingray bounty
	TASK_9154(9154, 3465), // Corsair Cove osprey bounty
	TASK_9155(9155, 19910), // Corsair Cove tiger shark bounty
	TASK_9156(9156, 40370), // Corsair Cove great white shark bounty
	TASK_9157(9157, 3465), // Ruins of Unkah bull shark bounty
	TASK_9158(9158, 8800), // Ruins of Unkah hammerhead shark bounty
	TASK_9159(9159, 19910), // Ruins of Unkah tiger shark bounty
	TASK_9160(9160, 8800), // Ruins of Unkah butterfly ray bounty
	TASK_9161(9161, 3465), // Ruins of Unkah eagle ray bounty
	TASK_9162(9162, 14575), // Ruins of Unkah albatross bounty
	TASK_9163(9163, 40370), // Ruins of Unkah great white shark bounty
	TASK_9164(9164, 11825), // Void Knights' Outpost stingray bounty
	TASK_9165(9165, 3465), // Void Knights' Outpost osprey bounty
	TASK_9166(9166, 11825), // Void Knights' Outpost frigatebird bounty
	TASK_9167(9167, 14575), // Void Knights' Outpost pygmy kraken bounty
	TASK_9168(9168, 3465), // Void Knights' Outpost eagle ray bounty
	TASK_9169(9169, 40370), // Void Knights' Outpost great white shark bounty
	TASK_9170(9170, 25135), // Void Knights' Outpost manta ray bounty
	TASK_9171(9171, 8800), // Summer Shore butterfly ray bounty
	TASK_9172(9172, 3465), // Summer Shore eagle ray bounty
	TASK_9173(9173, 11825), // Summer Shore frigatebird bounty
	TASK_9174(9174, 40370), // Summer Shore great white shark bounty
	TASK_9175(9175, 14575), // Summer Shore albatross bounty
	TASK_9176(9176, 19910), // Summer Shore tiger shark bounty
	TASK_9177(9177, 11825), // Summer Shore stingray bounty
	TASK_9178(9178, 19910), // Red Rock tiger shark bounty
	TASK_9179(9179, 11825), // Red Rock frigatebird bounty
	TASK_9180(9180, 3465), // Red Rock eagle ray bounty
	TASK_9181(9181, 40370), // Red Rock great white shark bounty
	TASK_9182(9182, 11825), // Red Rock stingray bounty
	TASK_9183(9183, 19910), // Red Rock tiger shark bounty
	TASK_9184(9184, 30965), // Red Rock spined kraken bounty
	TASK_9185(9185, 3465), // Land's End bull shark bounty
	TASK_9186(9186, 3465), // Land's End osprey bounty
	TASK_9187(9187, 3465), // Land's End tern bounty
	TASK_9188(9188, 14575), // Land's End pygmy kraken bounty
	TASK_9189(9189, 8800), // Land's End hammerhead shark bounty
	TASK_9190(9190, 40370), // Land's End great white shark bounty
	TASK_9191(9191, 8800), // Land's End butterfly ray bounty
	TASK_9192(9192, 3465), // Port Piscarilius osprey bounty
	TASK_9193(9193, 3465), // Port Piscarilius bull shark bounty
	TASK_9194(9194, 3465), // Port Piscarilius tern bounty
	TASK_9195(9195, 30965), // Port Piscarilius spined kraken bounty
	TASK_9196(9196, 19910), // Port Piscarilius tiger shark bounty
	TASK_9197(9197, 8800), // Port Piscarilius butterfly ray bounty
	TASK_9198(9198, 40370), // Port Piscarilius armoured kraken bounty
	TASK_9199(9199, 3465), // Civitas illa Fortis osprey bounty
	TASK_9200(9200, 8800), // Civitas illa Fortis hammerhead shark bounty
	TASK_9201(9201, 3465), // Civitas illa Fortis bull shark bounty
	TASK_9202(9202, 40370), // Civitas illa Fortis armoured kraken bounty
	TASK_9203(9203, 3465), // Civitas illa Fortis tern bounty
	TASK_9204(9204, 11825), // Civitas illa Fortis frigatebird bounty
	TASK_9205(9205, 3465), // Civitas illa Fortis eagle ray bounty
	TASK_9206(9206, 11825), // Aldarin stingray bounty
	TASK_9207(9207, 3465), // Aldarin osprey bounty
	TASK_9208(9208, 8800), // Aldarin butterfly ray bounty
	TASK_9209(9209, 40370), // Aldarin great white shark bounty
	TASK_9210(9210, 8800), // Aldarin hammerhead shark bounty
	TASK_9211(9211, 30965), // Aldarin spined kraken bounty
	TASK_9212(9212, 11825), // Aldarin frigatebird bounty
	TASK_9213(9213, 8800), // Port Roberts hammerhead shark bounty
	TASK_9214(9214, 3465), // Port Roberts osprey bounty
	TASK_9215(9215, 40370), // Port Roberts armoured kraken bounty
	TASK_9216(9216, 40370), // Port Roberts great white shark bounty
	TASK_9217(9217, 3465), // Port Roberts tern bounty
	TASK_9218(9218, 47080), // Port Roberts orca bounty
	TASK_9219(9219, 14575), // Port Roberts albatross bounty
	TASK_9220(9220, 11825), // Deepfin Point frigatebird bounty
	TASK_9221(9221, 3465), // Deepfin Point eagle ray bounty
	TASK_9222(9222, 30965), // Deepfin Point spined kraken bounty
	TASK_9223(9223, 3465), // Deepfin Point osprey bounty
	TASK_9224(9224, 11825), // Deepfin Point stingray bounty
	TASK_9225(9225, 19910), // Deepfin Point tiger shark bounty
	TASK_9226(9226, 8800), // Deepfin Point hammerhead shark bounty
	TASK_9227(9227, 8800), // Port Tyras butterfly ray bounty
	TASK_9228(9228, 8800), // Port Tyras hammerhead shark bounty
	TASK_9229(9229, 3465), // Port Tyras bull shark bounty
	TASK_9230(9230, 40370), // Port Tyras armoured kraken bounty
	TASK_9231(9231, 14575), // Port Tyras pygmy kraken bounty
	TASK_9232(9232, 40370), // Port Tyras great white shark bounty
	TASK_9233(9233, 25135), // Port Tyras manta ray bounty
	TASK_9234(9234, 8800), // Prifddinas hammerhead shark bounty
	TASK_9235(9235, 14575), // Prifddinas pygmy kraken bounty
	TASK_9236(9236, 40370), // Prifddinas armoured kraken bounty
	TASK_9237(9237, 3465), // Prifddinas osprey bounty
	TASK_9238(9238, 40370), // Prifddinas great white shark bounty
	TASK_9239(9239, 25135), // Prifddinas manta ray bounty
	TASK_9240(9240, 8800), // Prifddinas hammerhead shark bounty
	TASK_9241(9241, 14575), // Rellekka albatross bounty
	TASK_9242(9242, 8800), // Rellekka hammerhead shark bounty
	TASK_9243(9243, 19910), // Rellekka narwhal bounty
	TASK_9244(9244, 40370), // Rellekka armoured kraken bounty
	TASK_9245(9245, 47080), // Rellekka orca bounty
	TASK_9246(9246, 47080), // Rellekka vampyre kraken bounty
	TASK_9247(9247, 30965), // Rellekka spined kraken bounty
	TASK_9248(9248, 14575), // Etceteria albatross bounty
	TASK_9249(9249, 47080), // Etceteria orca bounty
	TASK_9250(9250, 47080), // Etceteria vampyre kraken bounty
	TASK_9251(9251, 19910), // Etceteria narwhal bounty
	TASK_9252(9252, 30965), // Etceteria spined kraken bounty
	TASK_9253(9253, 47080), // Etceteria orca bounty
	TASK_9254(9254, 40370), // Etceteria armoured kraken bounty
	TASK_9255(9255, 40370), // Lunar Isle armoured kraken bounty
	TASK_9256(9256, 47080), // Lunar Isle vampyre kraken bounty
	TASK_9257(9257, 19910), // Lunar Isle narwhal bounty
	TASK_9258(9258, 47080), // Lunar Isle orca bounty
	TASK_9259(9259, 14575), // Lunar Isle albatross bounty
	TASK_9260(9260, 47080), // Lunar Isle vampyre kraken bounty
	TASK_9261(9261, 19910), // Lunar Isle narwhal bounty
	TASK_13310(13310, 47080), // Deepfin Point veiled kraken bounty
	TASK_13311(13311, 47080); // Port Tyras veiled kraken bounty

	private final int dbrow;
	private final int reward;

	private static final Map<Integer, TaskReward> BY_DBROW =
		Arrays.stream(values())
			.collect(Collectors.toMap(tr -> tr.dbrow, tr -> tr));

	TaskReward(int dbrow, int reward)
	{
		this.dbrow = dbrow;
		this.reward = reward;
	}

	public static int getIntRewardForTask(int dbrow)
	{
		TaskReward tr = BY_DBROW.get(dbrow);
		if (tr == null || tr.reward < 0)
		{
			return 0;
		}
		return tr.reward;
	}

	public static String getRewardForTask(int dbrow)
	{
		TaskReward tr = BY_DBROW.get(dbrow);
		if (tr == null || tr.reward < 0)
		{
			return "Unknown";
		}
		return String.valueOf(tr.reward);
	}

	public static String getBagSizeForTask(int dbrow)
	{
		TaskReward tr = BY_DBROW.get(dbrow);
		if (tr == null || tr.reward <= 0)
		{
			return "Unknown";
		}
		if (tr.reward < 400)
		{
			return "Tiny";
		}
		if (tr.reward < 1000)
		{
			return "Small";
		}
		if (tr.reward < 2500)
		{
			return "Medium";
		}
		if (tr.reward < 6000)
		{
			return "Large";
		}
		return "Huge";
	}
}
