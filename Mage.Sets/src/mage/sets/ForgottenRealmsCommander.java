package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class ForgottenRealmsCommander extends ExpansionSet {

    private static final ForgottenRealmsCommander instance = new ForgottenRealmsCommander();

    public static ForgottenRealmsCommander getInstance() {
        return instance;
    }

    private ForgottenRealmsCommander() {
        super("Forgotten Realms Commander", "AFC", ExpansionSet.buildDate(2021, 7, 23), SetType.SUPPLEMENTAL);
        this.hasBasicLands = false;

        cards.add(new SetCardInfo("Abundant Growth", 150, Rarity.COMMON, mage.cards.a.AbundantGrowth.class));
        cards.add(new SetCardInfo("Acidic Slime", 151, Rarity.UNCOMMON, mage.cards.a.AcidicSlime.class));
        cards.add(new SetCardInfo("Angel of Finality", 63, Rarity.RARE, mage.cards.a.AngelOfFinality.class));
        cards.add(new SetCardInfo("Angelic Gift", 64, Rarity.COMMON, mage.cards.a.AngelicGift.class));
        cards.add(new SetCardInfo("Anger", 113, Rarity.UNCOMMON, mage.cards.a.Anger.class));
        cards.add(new SetCardInfo("Apex of Power", 114, Rarity.MYTHIC, mage.cards.a.ApexOfPower.class));
        cards.add(new SetCardInfo("Arcane Endeavor", 14, Rarity.RARE, mage.cards.a.ArcaneEndeavor.class));
        cards.add(new SetCardInfo("Arcane Sanctum", 223, Rarity.UNCOMMON, mage.cards.a.ArcaneSanctum.class));
        cards.add(new SetCardInfo("Arcane Signet", 197, Rarity.COMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Argentum Armor", 198, Rarity.RARE, mage.cards.a.ArgentumArmor.class));
        cards.add(new SetCardInfo("Ashen Rider", 175, Rarity.MYTHIC, mage.cards.a.AshenRider.class));
        cards.add(new SetCardInfo("Atarka, World Render", 176, Rarity.RARE, mage.cards.a.AtarkaWorldRender.class));
        cards.add(new SetCardInfo("Azorius Chancery", 224, Rarity.UNCOMMON, mage.cards.a.AzoriusChancery.class));
        cards.add(new SetCardInfo("Bag of Devouring", 21, Rarity.RARE, mage.cards.b.BagOfDevouring.class));
        cards.add(new SetCardInfo("Bag of Tricks", 37, Rarity.RARE, mage.cards.b.BagOfTricks.class));
        cards.add(new SetCardInfo("Baleful Strix", 177, Rarity.RARE, mage.cards.b.BalefulStrix.class));
        cards.add(new SetCardInfo("Bant Charm", 178, Rarity.UNCOMMON, mage.cards.b.BantCharm.class));
        cards.add(new SetCardInfo("Bant Panorama", 225, Rarity.COMMON, mage.cards.b.BantPanorama.class));
        cards.add(new SetCardInfo("Basilisk Collar", 199, Rarity.RARE, mage.cards.b.BasiliskCollar.class));
        cards.add(new SetCardInfo("Beast Within", 152, Rarity.UNCOMMON, mage.cards.b.BeastWithin.class));
        cards.add(new SetCardInfo("Bedevil", 179, Rarity.RARE, mage.cards.b.Bedevil.class));
        cards.add(new SetCardInfo("Behemoth Sledge", 180, Rarity.UNCOMMON, mage.cards.b.BehemothSledge.class));
        cards.add(new SetCardInfo("Belt of Giant Strength", 38, Rarity.RARE, mage.cards.b.BeltOfGiantStrength.class));
        cards.add(new SetCardInfo("Bituminous Blast", 181, Rarity.UNCOMMON, mage.cards.b.BituminousBlast.class));
        cards.add(new SetCardInfo("Bogardan Hellkite", 115, Rarity.MYTHIC, mage.cards.b.BogardanHellkite.class));
        cards.add(new SetCardInfo("Bojuka Bog", 226, Rarity.COMMON, mage.cards.b.BojukaBog.class));
        cards.add(new SetCardInfo("Brainstorm", 79, Rarity.COMMON, mage.cards.b.Brainstorm.class));
        cards.add(new SetCardInfo("Bucknard's Everfull Purse", 57, Rarity.UNCOMMON, mage.cards.b.BucknardsEverfullPurse.class));
        cards.add(new SetCardInfo("Burnished Hart", 200, Rarity.UNCOMMON, mage.cards.b.BurnishedHart.class));
        cards.add(new SetCardInfo("Canopy Vista", 227, Rarity.RARE, mage.cards.c.CanopyVista.class));
        cards.add(new SetCardInfo("Cataclysmic Gearhulk", 65, Rarity.MYTHIC, mage.cards.c.CataclysmicGearhulk.class));
        cards.add(new SetCardInfo("Catti-brie of Mithral Hall", 44, Rarity.RARE, mage.cards.c.CattiBrieOfMithralHall.class));
        cards.add(new SetCardInfo("Chain Reaction", 116, Rarity.RARE, mage.cards.c.ChainReaction.class));
        cards.add(new SetCardInfo("Chameleon Colossus", 153, Rarity.RARE, mage.cards.c.ChameleonColossus.class));
        cards.add(new SetCardInfo("Champion of Wits", 80, Rarity.RARE, mage.cards.c.ChampionOfWits.class));
        cards.add(new SetCardInfo("Chaos Dragon", 30, Rarity.RARE, mage.cards.c.ChaosDragon.class));
        cards.add(new SetCardInfo("Chaos Wand", 201, Rarity.RARE, mage.cards.c.ChaosWand.class));
        cards.add(new SetCardInfo("Chaos Warp", 117, Rarity.RARE, mage.cards.c.ChaosWarp.class));
        cards.add(new SetCardInfo("Chittering Witch", 95, Rarity.RARE, mage.cards.c.ChitteringWitch.class));
        cards.add(new SetCardInfo("Choked Estuary", 228, Rarity.RARE, mage.cards.c.ChokedEstuary.class));
        cards.add(new SetCardInfo("Cinder Glade", 229, Rarity.RARE, mage.cards.c.CinderGlade.class));
        cards.add(new SetCardInfo("Clay Golem", 58, Rarity.UNCOMMON, mage.cards.c.ClayGolem.class));
        cards.add(new SetCardInfo("Cloudblazer", 182, Rarity.UNCOMMON, mage.cards.c.Cloudblazer.class));
        cards.add(new SetCardInfo("Cold-Eyed Selkie", 183, Rarity.RARE, mage.cards.c.ColdEyedSelkie.class));
        cards.add(new SetCardInfo("Colossal Majesty", 154, Rarity.UNCOMMON, mage.cards.c.ColossalMajesty.class));
        cards.add(new SetCardInfo("Colossus Hammer", 202, Rarity.UNCOMMON, mage.cards.c.ColossusHammer.class));
        cards.add(new SetCardInfo("Command Tower", 230, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Commander's Sphere", 203, Rarity.COMMON, mage.cards.c.CommandersSphere.class));
        cards.add(new SetCardInfo("Commune with Lava", 118, Rarity.RARE, mage.cards.c.CommuneWithLava.class));
        cards.add(new SetCardInfo("Component Pouch", 59, Rarity.UNCOMMON, mage.cards.c.ComponentPouch.class));
        cards.add(new SetCardInfo("Consuming Vapors", 96, Rarity.RARE, mage.cards.c.ConsumingVapors.class));
        cards.add(new SetCardInfo("Crucible of the Spirit Dragon", 231, Rarity.RARE, mage.cards.c.CrucibleOfTheSpiritDragon.class));
        cards.add(new SetCardInfo("Cultivate", 155, Rarity.UNCOMMON, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Curator of Mysteries", 81, Rarity.RARE, mage.cards.c.CuratorOfMysteries.class));
        cards.add(new SetCardInfo("Curse of Verbosity", 82, Rarity.UNCOMMON, mage.cards.c.CurseOfVerbosity.class));
        cards.add(new SetCardInfo("Danse Macabre", 22, Rarity.RARE, mage.cards.d.DanseMacabre.class));
        cards.add(new SetCardInfo("Dark-Dweller Oracle", 119, Rarity.RARE, mage.cards.d.DarkDwellerOracle.class));
        cards.add(new SetCardInfo("Darkwater Catacombs", 232, Rarity.RARE, mage.cards.d.DarkwaterCatacombs.class));
        cards.add(new SetCardInfo("Dead Man's Chest", 97, Rarity.RARE, mage.cards.d.DeadMansChest.class));
        cards.add(new SetCardInfo("Decree of Savagery", 156, Rarity.RARE, mage.cards.d.DecreeOfSavagery.class));
        cards.add(new SetCardInfo("Demanding Dragon", 120, Rarity.RARE, mage.cards.d.DemandingDragon.class));
        cards.add(new SetCardInfo("Desert", 233, Rarity.UNCOMMON, mage.cards.d.Desert.class));
        cards.add(new SetCardInfo("Despark", 184, Rarity.UNCOMMON, mage.cards.d.Despark.class));
        cards.add(new SetCardInfo("Dimir Aqueduct", 234, Rarity.UNCOMMON, mage.cards.d.DimirAqueduct.class));
        cards.add(new SetCardInfo("Dire Fleet Daredevil", 121, Rarity.RARE, mage.cards.d.DireFleetDaredevil.class));
        cards.add(new SetCardInfo("Disrupt Decorum", 122, Rarity.RARE, mage.cards.d.DisruptDecorum.class));
        cards.add(new SetCardInfo("Diviner's Portent", 15, Rarity.RARE, mage.cards.d.DivinersPortent.class));
        cards.add(new SetCardInfo("Doomed Necromancer", 98, Rarity.RARE, mage.cards.d.DoomedNecromancer.class));
        cards.add(new SetCardInfo("Dragon's Hoard", 204, Rarity.RARE, mage.cards.d.DragonsHoard.class));
        cards.add(new SetCardInfo("Dragonborn Champion", 45, Rarity.RARE, mage.cards.d.DragonbornChampion.class));
        cards.add(new SetCardInfo("Dragonlord's Servant", 123, Rarity.UNCOMMON, mage.cards.d.DragonlordsServant.class));
        cards.add(new SetCardInfo("Dragonmaster Outcast", 124, Rarity.MYTHIC, mage.cards.d.DragonmasterOutcast.class));
        cards.add(new SetCardInfo("Dragonspeaker Shaman", 330, Rarity.UNCOMMON, mage.cards.d.DragonspeakerShaman.class));
        cards.add(new SetCardInfo("Dream Pillager", 125, Rarity.RARE, mage.cards.d.DreamPillager.class));
        cards.add(new SetCardInfo("Druid of Purification", 39, Rarity.RARE, mage.cards.d.DruidOfPurification.class));
        cards.add(new SetCardInfo("Ebony Fly", 60, Rarity.UNCOMMON, mage.cards.e.EbonyFly.class));
        cards.add(new SetCardInfo("Eel Umbra", 83, Rarity.COMMON, mage.cards.e.EelUmbra.class));
        cards.add(new SetCardInfo("Esper Panorama", 235, Rarity.COMMON, mage.cards.e.EsperPanorama.class));
        cards.add(new SetCardInfo("Etali, Primal Storm", 126, Rarity.RARE, mage.cards.e.EtaliPrimalStorm.class));
        cards.add(new SetCardInfo("Eternal Dragon", 66, Rarity.RARE, mage.cards.e.EternalDragon.class));
        cards.add(new SetCardInfo("Exotic Orchard", 236, Rarity.RARE, mage.cards.e.ExoticOrchard.class));
        cards.add(new SetCardInfo("Explore", 157, Rarity.COMMON, mage.cards.e.Explore.class));
        cards.add(new SetCardInfo("Explorer's Scope", 205, Rarity.COMMON, mage.cards.e.ExplorersScope.class));
        cards.add(new SetCardInfo("Fellwar Stone", 206, Rarity.UNCOMMON, mage.cards.f.FellwarStone.class));
        cards.add(new SetCardInfo("Fertile Ground", 158, Rarity.COMMON, mage.cards.f.FertileGround.class));
        cards.add(new SetCardInfo("Fey Steed", 5, Rarity.RARE, mage.cards.f.FeySteed.class));
        cards.add(new SetCardInfo("Fiend of the Shadows", 99, Rarity.RARE, mage.cards.f.FiendOfTheShadows.class));
        cards.add(new SetCardInfo("Fiendlash", 31, Rarity.RARE, mage.cards.f.Fiendlash.class));
        cards.add(new SetCardInfo("Fleecemane Lion", 185, Rarity.RARE, mage.cards.f.FleecemaneLion.class));
        cards.add(new SetCardInfo("Flood Plain", 237, Rarity.UNCOMMON, mage.cards.f.FloodPlain.class));
        cards.add(new SetCardInfo("Forbidden Alchemy", 84, Rarity.UNCOMMON, mage.cards.f.ForbiddenAlchemy.class));
        cards.add(new SetCardInfo("Foreboding Ruins", 238, Rarity.RARE, mage.cards.f.ForebodingRuins.class));
        cards.add(new SetCardInfo("Fortified Village", 239, Rarity.RARE, mage.cards.f.FortifiedVillage.class));
        cards.add(new SetCardInfo("Game Trail", 240, Rarity.RARE, mage.cards.g.GameTrail.class));
        cards.add(new SetCardInfo("Garruk's Uprising", 159, Rarity.UNCOMMON, mage.cards.g.GarruksUprising.class));
        cards.add(new SetCardInfo("Geier Reach Sanitarium", 241, Rarity.RARE, mage.cards.g.GeierReachSanitarium.class));
        cards.add(new SetCardInfo("Gonti, Lord of Luxury", 100, Rarity.RARE, mage.cards.g.GontiLordOfLuxury.class));
        cards.add(new SetCardInfo("Grasslands", 242, Rarity.UNCOMMON, mage.cards.g.Grasslands.class));
        cards.add(new SetCardInfo("Gratuitous Violence", 127, Rarity.RARE, mage.cards.g.GratuitousViolence.class));
        cards.add(new SetCardInfo("Greater Good", 160, Rarity.RARE, mage.cards.g.GreaterGood.class));
        cards.add(new SetCardInfo("Grim Hireling", 25, Rarity.RARE, mage.cards.g.GrimHireling.class));
        cards.add(new SetCardInfo("Gruul Signet", 207, Rarity.UNCOMMON, mage.cards.g.GruulSignet.class));
        cards.add(new SetCardInfo("Gruul Turf", 243, Rarity.UNCOMMON, mage.cards.g.GruulTurf.class));
        cards.add(new SetCardInfo("Gryff's Boon", 67, Rarity.UNCOMMON, mage.cards.g.GryffsBoon.class));
        cards.add(new SetCardInfo("Halimar Depths", 244, Rarity.COMMON, mage.cards.h.HalimarDepths.class));
        cards.add(new SetCardInfo("Haven of the Spirit Dragon", 245, Rarity.RARE, mage.cards.h.HavenOfTheSpiritDragon.class));
        cards.add(new SetCardInfo("Heirloom Blade", 208, Rarity.UNCOMMON, mage.cards.h.HeirloomBlade.class));
        cards.add(new SetCardInfo("Hellish Rebuke", 26, Rarity.RARE, mage.cards.h.HellishRebuke.class));
        cards.add(new SetCardInfo("Heroic Intervention", 161, Rarity.RARE, mage.cards.h.HeroicIntervention.class));
        cards.add(new SetCardInfo("Hex", 101, Rarity.RARE, mage.cards.h.Hex.class));
        cards.add(new SetCardInfo("High Market", 246, Rarity.RARE, mage.cards.h.HighMarket.class));
        cards.add(new SetCardInfo("Hoard-Smelter Dragon", 128, Rarity.RARE, mage.cards.h.HoardSmelterDragon.class));
        cards.add(new SetCardInfo("Holy Avenger", 6, Rarity.RARE, mage.cards.h.HolyAvenger.class));
        cards.add(new SetCardInfo("Hostage Taker", 186, Rarity.RARE, mage.cards.h.HostageTaker.class));
        cards.add(new SetCardInfo("Hurl Through Hell", 48, Rarity.RARE, mage.cards.h.HurlThroughHell.class));
        cards.add(new SetCardInfo("Ignite the Future", 129, Rarity.RARE, mage.cards.i.IgniteTheFuture.class));
        cards.add(new SetCardInfo("Immovable Rod", 7, Rarity.RARE, mage.cards.i.ImmovableRod.class));
        cards.add(new SetCardInfo("Imprisoned in the Moon", 85, Rarity.RARE, mage.cards.i.ImprisonedInTheMoon.class));
        cards.add(new SetCardInfo("Indomitable Might", 40, Rarity.RARE, mage.cards.i.IndomitableMight.class));
        cards.add(new SetCardInfo("Izzet Chemister", 130, Rarity.RARE, mage.cards.i.IzzetChemister.class));
        cards.add(new SetCardInfo("Karazikar, the Eye Tyrant", 49, Rarity.MYTHIC, mage.cards.k.KarazikarTheEyeTyrant.class));
        cards.add(new SetCardInfo("Karmic Guide", 68, Rarity.RARE, mage.cards.k.KarmicGuide.class));
        cards.add(new SetCardInfo("Kenrith's Transformation", 162, Rarity.UNCOMMON, mage.cards.k.KenrithsTransformation.class));
        cards.add(new SetCardInfo("Kindred Summons", 163, Rarity.RARE, mage.cards.k.KindredSummons.class));
        cards.add(new SetCardInfo("Klauth's Will", 51, Rarity.RARE, mage.cards.k.KlauthsWill.class));
        cards.add(new SetCardInfo("Klauth, Unrivaled Ancient", 50, Rarity.MYTHIC, mage.cards.k.KlauthUnrivaledAncient.class));
        cards.add(new SetCardInfo("Knight of Autumn", 187, Rarity.RARE, mage.cards.k.KnightOfAutumn.class));
        cards.add(new SetCardInfo("Light Up the Stage", 131, Rarity.UNCOMMON, mage.cards.l.LightUpTheStage.class));
        cards.add(new SetCardInfo("Lightning Greaves", 331, Rarity.UNCOMMON, mage.cards.l.LightningGreaves.class));
        cards.add(new SetCardInfo("Lorcan, Warlock Collector", 27, Rarity.RARE, mage.cards.l.LorcanWarlockCollector.class));
        cards.add(new SetCardInfo("Loyal Apprentice", 132, Rarity.UNCOMMON, mage.cards.l.LoyalApprentice.class));
        cards.add(new SetCardInfo("Lumbering Falls", 247, Rarity.RARE, mage.cards.l.LumberingFalls.class));
        cards.add(new SetCardInfo("Maddening Hex", 32, Rarity.RARE, mage.cards.m.MaddeningHex.class));
        cards.add(new SetCardInfo("Magmaquake", 133, Rarity.RARE, mage.cards.m.Magmaquake.class));
        cards.add(new SetCardInfo("Mantle of the Ancients", 8, Rarity.RARE, mage.cards.m.MantleOfTheAncients.class));
        cards.add(new SetCardInfo("Marionette Master", 102, Rarity.RARE, mage.cards.m.MarionetteMaster.class));
        cards.add(new SetCardInfo("Masterwork of Ingenuity", 209, Rarity.RARE, mage.cards.m.MasterworkOfIngenuity.class));
        cards.add(new SetCardInfo("Merfolk Looter", 86, Rarity.UNCOMMON, mage.cards.m.MerfolkLooter.class));
        cards.add(new SetCardInfo("Meteor Golem", 210, Rarity.UNCOMMON, mage.cards.m.MeteorGolem.class));
        cards.add(new SetCardInfo("Midnight Pathlighter", 52, Rarity.RARE, mage.cards.m.MidnightPathlighter.class));
        cards.add(new SetCardInfo("Mind Stone", 211, Rarity.UNCOMMON, mage.cards.m.MindStone.class));
        cards.add(new SetCardInfo("Minn, Wily Illusionist", 16, Rarity.RARE, mage.cards.m.MinnWilyIllusionist.class));
        cards.add(new SetCardInfo("Mishra's Factory", 248, Rarity.UNCOMMON, mage.cards.m.MishrasFactory.class));
        cards.add(new SetCardInfo("Moonsilver Spear", 212, Rarity.RARE, mage.cards.m.MoonsilverSpear.class));
        cards.add(new SetCardInfo("Mortuary Mire", 249, Rarity.COMMON, mage.cards.m.MortuaryMire.class));
        cards.add(new SetCardInfo("Mossfire Valley", 250, Rarity.RARE, mage.cards.m.MossfireValley.class));
        cards.add(new SetCardInfo("Mosswort Bridge", 251, Rarity.RARE, mage.cards.m.MosswortBridge.class));
        cards.add(new SetCardInfo("Mulldrifter", 87, Rarity.UNCOMMON, mage.cards.m.Mulldrifter.class));
        cards.add(new SetCardInfo("Murder of Crows", 88, Rarity.UNCOMMON, mage.cards.m.MurderOfCrows.class));
        cards.add(new SetCardInfo("Nature's Lore", 164, Rarity.COMMON, mage.cards.n.NaturesLore.class));
        cards.add(new SetCardInfo("Netherese Puzzle-Ward", 17, Rarity.RARE, mage.cards.n.NetheresePuzzleWard.class));
        cards.add(new SetCardInfo("Reckless Endeavor", 33, Rarity.RARE, mage.cards.r.RecklessEndeavor.class));
        cards.add(new SetCardInfo("Necromantic Selection", 103, Rarity.RARE, mage.cards.n.NecromanticSelection.class));
        cards.add(new SetCardInfo("Necrotic Sliver", 188, Rarity.UNCOMMON, mage.cards.n.NecroticSliver.class));
        cards.add(new SetCardInfo("Neverwinter Hydra", 41, Rarity.RARE, mage.cards.n.NeverwinterHydra.class));
        cards.add(new SetCardInfo("Nihiloor", 53, Rarity.MYTHIC, mage.cards.n.Nihiloor.class));
        cards.add(new SetCardInfo("Nimbus Maze", 252, Rarity.RARE, mage.cards.n.NimbusMaze.class));
        cards.add(new SetCardInfo("Obsessive Stitcher", 189, Rarity.UNCOMMON, mage.cards.o.ObsessiveStitcher.class));
        cards.add(new SetCardInfo("Ogre Slumlord", 104, Rarity.RARE, mage.cards.o.OgreSlumlord.class));
        cards.add(new SetCardInfo("Opportunistic Dragon", 134, Rarity.RARE, mage.cards.o.OpportunisticDragon.class));
        cards.add(new SetCardInfo("Orazca Relic", 213, Rarity.COMMON, mage.cards.o.OrazcaRelic.class));
        cards.add(new SetCardInfo("Orzhov Basilica", 253, Rarity.UNCOMMON, mage.cards.o.OrzhovBasilica.class));
        cards.add(new SetCardInfo("Outpost Siege", 135, Rarity.RARE, mage.cards.o.OutpostSiege.class));
        cards.add(new SetCardInfo("Paradise Druid", 165, Rarity.UNCOMMON, mage.cards.p.ParadiseDruid.class));
        cards.add(new SetCardInfo("Path of Ancestry", 254, Rarity.COMMON, mage.cards.p.PathOfAncestry.class));
        cards.add(new SetCardInfo("Phantasmal Image", 89, Rarity.RARE, mage.cards.p.PhantasmalImage.class));
        cards.add(new SetCardInfo("Phantom Steed", 18, Rarity.RARE, mage.cards.p.PhantomSteed.class));
        cards.add(new SetCardInfo("Phthisis", 105, Rarity.UNCOMMON, mage.cards.p.Phthisis.class));
        cards.add(new SetCardInfo("Piper of the Swarm", 106, Rarity.RARE, mage.cards.p.PiperOfTheSwarm.class));
        cards.add(new SetCardInfo("Plaguecrafter", 107, Rarity.UNCOMMON, mage.cards.p.Plaguecrafter.class));
        cards.add(new SetCardInfo("Pontiff of Blight", 108, Rarity.RARE, mage.cards.p.PontiffOfBlight.class));
        cards.add(new SetCardInfo("Port Town", 255, Rarity.RARE, mage.cards.p.PortTown.class));
        cards.add(new SetCardInfo("Prairie Stream", 256, Rarity.RARE, mage.cards.p.PrairieStream.class));
        cards.add(new SetCardInfo("Prognostic Sphinx", 90, Rarity.RARE, mage.cards.p.PrognosticSphinx.class));
        cards.add(new SetCardInfo("Propaganda", 91, Rarity.UNCOMMON, mage.cards.p.Propaganda.class));
        cards.add(new SetCardInfo("Prosper, Tome-Bound", 2, Rarity.MYTHIC, mage.cards.p.ProsperTomeBound.class));
        cards.add(new SetCardInfo("Psychic Impetus", 92, Rarity.UNCOMMON, mage.cards.p.PsychicImpetus.class));
        cards.add(new SetCardInfo("Puresteel Paladin", 69, Rarity.RARE, mage.cards.p.PuresteelPaladin.class));
        cards.add(new SetCardInfo("Radiant Solar", 9, Rarity.RARE, mage.cards.r.RadiantSolar.class));
        cards.add(new SetCardInfo("Rakdos Carnarium", 257, Rarity.UNCOMMON, mage.cards.r.RakdosCarnarium.class));
        cards.add(new SetCardInfo("Rakdos Charm", 190, Rarity.UNCOMMON, mage.cards.r.RakdosCharm.class));
        cards.add(new SetCardInfo("Rakdos Signet", 214, Rarity.UNCOMMON, mage.cards.r.RakdosSignet.class));
        cards.add(new SetCardInfo("Rampant Growth", 166, Rarity.COMMON, mage.cards.r.RampantGrowth.class));
        cards.add(new SetCardInfo("Rancor", 167, Rarity.UNCOMMON, mage.cards.r.Rancor.class));
        cards.add(new SetCardInfo("Realm-Cloaked Giant", 70, Rarity.MYTHIC, mage.cards.r.RealmCloakedGiant.class));
        cards.add(new SetCardInfo("Reassembling Skeleton", 109, Rarity.UNCOMMON, mage.cards.r.ReassemblingSkeleton.class));
        cards.add(new SetCardInfo("Return of the Wildspeaker", 168, Rarity.RARE, mage.cards.r.ReturnOfTheWildspeaker.class));
        cards.add(new SetCardInfo("Return to Nature", 169, Rarity.COMMON, mage.cards.r.ReturnToNature.class));
        cards.add(new SetCardInfo("Revivify", 10, Rarity.RARE, mage.cards.r.Revivify.class));
        cards.add(new SetCardInfo("Ride the Avalanche", 54, Rarity.RARE, mage.cards.r.RideTheAvalanche.class));
        cards.add(new SetCardInfo("Rile", 136, Rarity.COMMON, mage.cards.r.Rile.class));
        cards.add(new SetCardInfo("Rishkar's Expertise", 170, Rarity.RARE, mage.cards.r.RishkarsExpertise.class));
        cards.add(new SetCardInfo("Riverwise Augur", 93, Rarity.UNCOMMON, mage.cards.r.RiverwiseAugur.class));
        cards.add(new SetCardInfo("Robe of Stars", 11, Rarity.RARE, mage.cards.r.RobeOfStars.class));
        cards.add(new SetCardInfo("Ronom Unicorn", 71, Rarity.COMMON, mage.cards.r.RonomUnicorn.class));
        cards.add(new SetCardInfo("Savage Ventmaw", 191, Rarity.UNCOMMON, mage.cards.s.SavageVentmaw.class));
        cards.add(new SetCardInfo("Scourge of Valkas", 137, Rarity.RARE, mage.cards.s.ScourgeOfValkas.class));
        cards.add(new SetCardInfo("Seaside Citadel", 258, Rarity.UNCOMMON, mage.cards.s.SeasideCitadel.class));
        cards.add(new SetCardInfo("Sefris of the Hidden Ways", 3, Rarity.MYTHIC, mage.cards.s.SefrisOfTheHiddenWays.class));
        cards.add(new SetCardInfo("Serum Visions", 94, Rarity.UNCOMMON, mage.cards.s.SerumVisions.class));
        cards.add(new SetCardInfo("Shadowblood Ridge", 259, Rarity.RARE, mage.cards.s.ShadowbloodRidge.class));
        cards.add(new SetCardInfo("Shamanic Revelation", 171, Rarity.RARE, mage.cards.s.ShamanicRevelation.class));
        cards.add(new SetCardInfo("Shielding Plax", 192, Rarity.COMMON, mage.cards.s.ShieldingPlax.class));
        cards.add(new SetCardInfo("Shiny Impetus", 138, Rarity.UNCOMMON, mage.cards.s.ShinyImpetus.class));
        cards.add(new SetCardInfo("Shivan Hellkite", 139, Rarity.RARE, mage.cards.s.ShivanHellkite.class));
        cards.add(new SetCardInfo("Shriekmaw", 110, Rarity.UNCOMMON, mage.cards.s.Shriekmaw.class));
        cards.add(new SetCardInfo("Simic Growth Chamber", 260, Rarity.UNCOMMON, mage.cards.s.SimicGrowthChamber.class));
        cards.add(new SetCardInfo("Skycloud Expanse", 261, Rarity.RARE, mage.cards.s.SkycloudExpanse.class));
        cards.add(new SetCardInfo("Skyline Despot", 140, Rarity.RARE, mage.cards.s.SkylineDespot.class));
        cards.add(new SetCardInfo("Skyship Stalker", 141, Rarity.RARE, mage.cards.s.SkyshipStalker.class));
        cards.add(new SetCardInfo("Smoldering Marsh", 262, Rarity.RARE, mage.cards.s.SmolderingMarsh.class));
        cards.add(new SetCardInfo("Sol Ring", 215, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 216, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Song of Inspiration", 42, Rarity.RARE, mage.cards.s.SongOfInspiration.class));
        cards.add(new SetCardInfo("Spinerock Knoll", 263, Rarity.RARE, mage.cards.s.SpinerockKnoll.class));
        cards.add(new SetCardInfo("Spit Flame", 142, Rarity.RARE, mage.cards.s.SpitFlame.class));
        cards.add(new SetCardInfo("Sram, Senior Edificer", 72, Rarity.RARE, mage.cards.s.SramSeniorEdificer.class));
        cards.add(new SetCardInfo("Storvald, Frost Giant Jarl", 55, Rarity.MYTHIC, mage.cards.s.StorvaldFrostGiantJarl.class));
        cards.add(new SetCardInfo("Sun Titan", 73, Rarity.MYTHIC, mage.cards.s.SunTitan.class));
        cards.add(new SetCardInfo("Sunblast Angel", 74, Rarity.RARE, mage.cards.s.SunblastAngel.class));
        cards.add(new SetCardInfo("Sungrass Prairie", 264, Rarity.RARE, mage.cards.s.SungrassPrairie.class));
        cards.add(new SetCardInfo("Sunken Hollow", 265, Rarity.RARE, mage.cards.s.SunkenHollow.class));
        cards.add(new SetCardInfo("Swiftfoot Boots", 217, Rarity.UNCOMMON, mage.cards.s.SwiftfootBoots.class));
        cards.add(new SetCardInfo("Sword of Hours", 61, Rarity.UNCOMMON, mage.cards.s.SwordOfHours.class));
        cards.add(new SetCardInfo("Sword of the Animist", 218, Rarity.RARE, mage.cards.s.SwordOfTheAnimist.class));
        cards.add(new SetCardInfo("Swords to Plowshares", 75, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Tainted Peak", 266, Rarity.UNCOMMON, mage.cards.t.TaintedPeak.class));
        cards.add(new SetCardInfo("Talisman of Indulgence", 219, Rarity.UNCOMMON, mage.cards.t.TalismanOfIndulgence.class));
        cards.add(new SetCardInfo("Taurean Mauler", 143, Rarity.RARE, mage.cards.t.TaureanMauler.class));
        cards.add(new SetCardInfo("Tectonic Giant", 144, Rarity.RARE, mage.cards.t.TectonicGiant.class));
        cards.add(new SetCardInfo("Terminate", 193, Rarity.UNCOMMON, mage.cards.t.Terminate.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 267, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Terror of Mount Velus", 145, Rarity.RARE, mage.cards.t.TerrorOfMountVelus.class));
        cards.add(new SetCardInfo("Theater of Horrors", 194, Rarity.RARE, mage.cards.t.TheaterOfHorrors.class));
        cards.add(new SetCardInfo("Thorough Investigation", 12, Rarity.RARE, mage.cards.t.ThoroughInvestigation.class));
        cards.add(new SetCardInfo("Thriving Grove", 268, Rarity.COMMON, mage.cards.t.ThrivingGrove.class));
        cards.add(new SetCardInfo("Thriving Heath", 269, Rarity.COMMON, mage.cards.t.ThrivingHeath.class));
        cards.add(new SetCardInfo("Thriving Isle", 270, Rarity.COMMON, mage.cards.t.ThrivingIsle.class));
        cards.add(new SetCardInfo("Thriving Moor", 271, Rarity.COMMON, mage.cards.t.ThrivingMoor.class));
        cards.add(new SetCardInfo("Throes of Chaos", 146, Rarity.UNCOMMON, mage.cards.t.ThroesOfChaos.class));
        cards.add(new SetCardInfo("Thunderbreak Regent", 147, Rarity.RARE, mage.cards.t.ThunderbreakRegent.class));
        cards.add(new SetCardInfo("Unburial Rites", 111, Rarity.UNCOMMON, mage.cards.u.UnburialRites.class));
        cards.add(new SetCardInfo("Underdark Rift", 62, Rarity.UNCOMMON, mage.cards.u.UnderdarkRift.class));
        cards.add(new SetCardInfo("Unstable Obelisk", 220, Rarity.UNCOMMON, mage.cards.u.UnstableObelisk.class));
        cards.add(new SetCardInfo("Utopia Sprawl", 172, Rarity.UNCOMMON, mage.cards.u.UtopiaSprawl.class));
        cards.add(new SetCardInfo("Utter End", 195, Rarity.RARE, mage.cards.u.UtterEnd.class));
        cards.add(new SetCardInfo("Valiant Endeavor", 13, Rarity.RARE, mage.cards.v.ValiantEndeavor.class));
        cards.add(new SetCardInfo("Valorous Stance", 76, Rarity.UNCOMMON, mage.cards.v.ValorousStance.class));
        cards.add(new SetCardInfo("Vandalblast", 148, Rarity.UNCOMMON, mage.cards.v.Vandalblast.class));
        cards.add(new SetCardInfo("Vanish into Memory", 196, Rarity.UNCOMMON, mage.cards.v.VanishIntoMemory.class));
        cards.add(new SetCardInfo("Verdant Embrace", 173, Rarity.RARE, mage.cards.v.VerdantEmbrace.class));
        cards.add(new SetCardInfo("Victimize", 112, Rarity.UNCOMMON, mage.cards.v.Victimize.class));
        cards.add(new SetCardInfo("Viridian Longbow", 221, Rarity.COMMON, mage.cards.v.ViridianLongbow.class));
        cards.add(new SetCardInfo("Vitu-Ghazi, the City-Tree", 272, Rarity.UNCOMMON, mage.cards.v.VituGhaziTheCityTree.class));
        cards.add(new SetCardInfo("Vrondiss, Rage of Ancients", 4, Rarity.MYTHIC, mage.cards.v.VrondissRageOfAncients.class));
        cards.add(new SetCardInfo("Wall of Omens", 77, Rarity.UNCOMMON, mage.cards.w.WallOfOmens.class));
        cards.add(new SetCardInfo("Wand of Orcus", 28, Rarity.RARE, mage.cards.w.WandOfOrcus.class));
        cards.add(new SetCardInfo("Warstorm Surge", 149, Rarity.RARE, mage.cards.w.WarstormSurge.class));
        cards.add(new SetCardInfo("Wayfarer's Bauble", 222, Rarity.COMMON, mage.cards.w.WayfarersBauble.class));
        cards.add(new SetCardInfo("Wild Growth", 174, Rarity.COMMON, mage.cards.w.WildGrowth.class));
        cards.add(new SetCardInfo("Wild-Magic Sorcerer", 36, Rarity.RARE, mage.cards.w.WildMagicSorcerer.class));
        cards.add(new SetCardInfo("Winds of Rath", 78, Rarity.RARE, mage.cards.w.WindsOfRath.class));
        cards.add(new SetCardInfo("Winged Boots", 20, Rarity.RARE, mage.cards.w.WingedBoots.class));
        cards.add(new SetCardInfo("Wulfgar of Icewind Dale", 56, Rarity.RARE, mage.cards.w.WulfgarOfIcewindDale.class));
        cards.add(new SetCardInfo("Zhalfirin Void", 273, Rarity.UNCOMMON, mage.cards.z.ZhalfirinVoid.class));
    }
}
