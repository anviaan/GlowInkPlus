#### Glowing Sheep

- **Right-click interaction**: Using a Glow Ink Sac on a sheep makes its wool glow. The sheep must not be sheared and
  must not already be glowing.
- **Emissive wool rendering**: A glowing sheep's wool renders at full brightness (light level `0xF000F0`), making it
  visibly luminous regardless of ambient lighting.
- **Glow wool drops**: Shearing a glowing sheep drops 1-3 **Glow Wool** items matching the sheep's dye color, instead of
  the normal wool drop. All 16 dye colors are supported.
- **Persistent state**: The glowing state is saved and loaded with the entity's data (NBT field `GlowingWool`), so it
  survives world reloads and chunk unloads.
- **Network synchronization**: The glowing state is synced between server and client via `SynchedEntityData`, so all
  players see the glow in multiplayer.

#### Glowing Leather Armor

- **Smithing recipe (no template)**: Place any leather armor piece (helmet, chestplate, leggings, or boots) in the
  smithing table with a Glow Ink Sac as the addition — no template slot needed. The output is the same armor piece with
  the `GLOWING` data component attached.
- **Emissive armor rendering**: Leather armor with the `GLOWING` component renders at full brightness on the player
  model, making the armor visually luminous in dark environments.
- **Component system**: Introduced a custom `DataComponentType<Unit>` called `GLOWING` that can be attached to any item.
  This is the backbone for all glowing item features.
- **Cauldron washing**: Right-clicking a water cauldron while holding a glowing item (armor, banner, or shield) removes
  the `GLOWING` component, consuming one water level from the cauldron. This follows the same interaction pattern as
  washing dyed leather armor in vanilla.

#### Glowing Tooltip

- **Universal "Glowing" indicator**: Any item that has the `GLOWING` data component displays a yellow **"Glowing"** text
  line in its tooltip (below the item name). This applies to armor, banners, shields, and any future items that receive
  the component.

#### Glowing Banners

- **Crafting recipe (shapeless)**: Combine any banner (all 16 colors) with a Glow Ink Sac in a crafting table to produce
  a glowing version of that banner. All patterns, custom names, and color data are preserved on the result.
- **Emissive placed banner rendering**: When a glowing banner is placed in the world as a block (standing or
  wall-mounted), it renders at full brightness. The glow state is stored in the block entity's component map and
  persists through placement, breaking, and pick-block.
- **Emissive item rendering**: Glowing banners held in hand, displayed in item frames, or shown in the inventory render
  at full brightness.
- **Already-glowing rejection**: Banners that already have the `GLOWING` component cannot be re-crafted with another
  Glow Ink Sac (the recipe won't match).

#### Glowing Shields

- **Crafting recipe (shapeless)**: Combine a shield that already has a banner pattern applied (via the vanilla shield
  decoration recipe) with a Glow Ink Sac in a crafting table to make the shield glow.
- **Glow transfer from banner**: When combining a **glowing banner** with a shield using the vanilla shield decoration
  recipe (shapeless: banner + shield), the resulting decorated shield automatically inherits the `GLOWING` component
  from the banner.
- **Emissive shield rendering**: A shield with the `GLOWING` component renders at full brightness when held in hand (
  both blocking and idle positions), including its banner pattern layer.

#### Localization

- Updated all 14 language files (en_us, es_es, es_mx, de_de, fr_fr, it_it, ja_jp, ko_kr, pt_br, ru_ru, tr_tr, uk_ua,
  zh_cn, zh_tw) with the `"Glowing"` tooltip translation key.
