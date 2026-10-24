# House maps: five free downloads

Five free maps were downloaded for copying a wooden house into The Other. They are used with the separate **HouseCopy** mod, not with The Other.

The archives are stored locally in `../maps/` (inside the Mods workspace). A ready-to-copy kit is at `../HouseCopyKit/`. The map archives are **not committed** to the HouseCopy repository (third-party content).

## The five maps

| # | Map | Style | Archive | Size | World name | Data version | Spawn | Source |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | **Small Starter House** | Cozy taiga wooden cabin; screenshots show a wheat farm and cow pen | `small-starter-house.zip` | 31 MB | `Small Starter House 1.0.1` | 3465 (1.20.1) | `-309, 64, 19` | <https://www.9minecraft.net/small-starter-house-map> |
| 2 | **Ultimate Survival House** | Large, detailed wooden survival house | `ultimate-survival-house.zip` | 17 MB | `Huge Survival House` | 3465 (1.20.1) | `0, 69, 32` | <https://www.planetminecraft.com/project/ultimate-survival-house-download/> |
| 3 | **Survival Big House** | Big wooden survival house for 2–3 players | `survival-big-house.zip` | 8.6 MB | `CASE` | 2578 (older; upgrades) | `128, 70, 144` | <https://www.9minecraft.net/survival-big-house-map> |
| 4 | **Minecraft House** | Two-story American wooden house with a yard; classic bones | `minecraft-house.zip` | 5.0 MB | `Home` | 2730 (older; upgrades) | `-16, 4, 128` | <https://www.9minecraft.net/minecraft-house-map> |
| 5 | **Cozy Cake House** | Small whimsical wooden starter home | `cozy-cake-house.zip` | 51 MB | `Cozy Cake House 1.0.5` | 3465 (1.20.1) | `-220, 64, -41` | <https://www.9minecraft.net/cozy-cake-house-map/> |

Data versions were read from each `level.dat`:

- `3465` is Minecraft 1.20.1.
- `2730` and `2578` are older worlds. 1.20.1 opens and upgrades them on first load; test the house before exporting. The original zip is kept, so a failed upgrade cannot destroy the only copy.

## Which one fits level 1

**Best fit: Small Starter House.** It is already a small wooden cabin in a field, and its screenshots include a wheat farm and animal pen.

**Most detailed: Ultimate Survival House.** Natively 1.20.1 and larger.

**Biggest: Survival Big House.** Useful if the house should hold a basement and a story route; may be too large for a lone wheat field.

**Classic: Minecraft House.** A two-story wooden house with a yard and garage.

**Wildcard: Cozy Cake House.** The least horror-appropriate, but its "too perfect" look can work in the peaceful world before the reveal.

## Install the maps

Unzip each archive into the instance's `saves/` folder. Each archive already contains a top-level world folder.

```bash
for archive in ../maps/*.zip; do
  unzip -q "$archive" -d "/path/to/.minecraft/saves"
done
```

Or use the ready kit at `../HouseCopyKit/`: copy `HouseCopyKit/saves/*` into the instance `saves/`.

## Single-folder kit

```text
HouseCopyKit/
├── mods/housecopy-0.1.0.jar
├── saves/          (the five maps)
├── forge-1.20.1-47.4.28-installer.jar
└── README.md
```

This kit contains **only HouseCopy** and the world saves. It does not contain The Other. HouseCopy leaves the vanilla title screen unchanged.

## Workflow: from map to structure

1. Choose one house.
2. Open the world in a normal 1.20.1 Forge instance with HouseCopy installed.
3. If the map has cheats disabled, use **Open to LAN → Allow Cheats**.
4. Modify the house in-game: walls, roof, basement entrance, carpets, chest, sign, and the trapdoor.
5. Press F3 and note two opposite corners. Include the full roof and the basement if it is part of the house.
6. Run:

```mcfunction
/housecopy export house_name x1 y1 z1 x2 y2 z2
```

7. The command writes:

```text
<instance>/.minecraft/housecopy-exports/house_name.nbt
```

8. Send that file back. It is a standard structure NBT and can be placed in `data/<namespace>/structures/house_name.nbt` in The Other.

## Notes on fit and scale

- The export command is capped at 128 blocks per axis. Check the house size before selecting corners.
- A house with a deep basement may need two exports: one for the house, one for the basement room.
- The selection includes air and block entities. Chests and signs keep their NBT. Entities such as item frames and armor stands are excluded; add them after placement.
- Do not include a large slice of surrounding terrain. The wheat world already provides the ground; the house should sit on it.
- If the house has a custom resource pack, note it. The structure stores block states; a missing mod block would become air or a missing block on placement.

## Licensing and redistribution

- The maps are free to download for personal use, but that does **not** mean their assets can be redistributed in a public modpack.
- Do not commit the map archives, extracted worlds, or copied builds to the public repositories.
- A house built by a map author is their creative work. If the final modpack ships the house, ask the author for permission and credit them, or use a house built specifically for the project.
- The structure NBT exported from your own edited copy is still derived from the original build. Treat it as an attribution-required asset until permission is clear.

## Sources

- Small Starter House: <https://www.9minecraft.net/small-starter-house-map>
- Ultimate Survival House: <https://www.planetminecraft.com/project/ultimate-survival-house-download/>
- Survival Big House: <https://www.9minecraft.net/survival-big-house-map>
- Minecraft House: <https://www.9minecraft.net/minecraft-house-map>
- Cozy Cake House: <https://www.9minecraft.net/cozy-cake-house-map/>
- Planet Minecraft install guide: <https://www.planetminecraft.com/blog/how-to-download-and-install-minecraft-maps/>
- Minecraft Wiki, structure block: <https://minecraft.wiki/w/Structure_Block>
