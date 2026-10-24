# HouseCopy

A standalone Minecraft **Forge 1.20.1** mod that copies a selected region into a structure `.nbt` file.

It has **no title screen changes**, no world generation, no mob changes, and no other content. Install it in a normal 1.20.1 Forge instance, open any world, and export a house.

## Command

```mcfunction
/housecopy export <name> <x1> <y1> <z1> <x2> <y2> <z2>
```

Example:

```mcfunction
/housecopy export wheat_house 120 64 -40 145 84 -15
```

- `<name>` is a word (`a-z`, `0-9`, `_`).
- The two positions are opposite corners; order does not matter.
- The selection is inclusive.
- Maximum size is **128 blocks per axis**.
- Requires permission level 2 (cheats).
- Copies blocks and block entities (chests, signs, furnaces), not entities.

## Output

```text
<game directory>/housecopy-exports/<name>.nbt
```

On a normal client:

```text
.minecraft/housecopy-exports/<name>.nbt
```

The file is a standard structure NBT and can be placed with a structure block or added to a mod's `data/<namespace>/structures/` folder.

## Install

1. Install Java 17.
2. Install Minecraft 1.20.1 Forge **47.4.28**.
3. Put `housecopy-0.1.0.jar` in `.minecraft/mods/`.
4. Launch the normal Forge profile. The vanilla title screen is unchanged.
5. Open a world with cheats enabled.

If a downloaded map has cheats disabled, use **Open to LAN → Allow Cheats**.

## Why a separate mod

The Other has a custom title screen and its own world rules. HouseCopy deliberately does none of that: it is only the export command, so it can be used with the normal world list and any 1.20.1 Forge world.

## Build

GitHub Actions builds every push:

```text
.github/workflows/build.yml
```

The artifact is `housecopy-jar`. Do not build locally.

## License

All Rights Reserved until a license is chosen. The template files are MIT; see `TEMPLATE_LICENSE.txt`.
