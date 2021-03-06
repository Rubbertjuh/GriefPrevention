/*
 * This file is part of GriefPrevention, licensed under the MIT License (MIT).
 *
 * Copyright (c) Ryan Hamshire
 * Copyright (c) bloodmc
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package me.ryanhamshire.griefprevention.task;

import org.spongepowered.api.entity.living.player.Player;

public class WelcomeTask implements Runnable {

    private final Player player;

    public WelcomeTask(Player player) {
        this.player = player;
    }

    @Override
    public void run() {
        // abort if player has logged out since this task was scheduled
        if (!this.player.isOnline()) {
            return;
        }

        // offer advice and a helpful link
        /*GriefPreventionPlugin.sendMessage(player, TextMode.Instr, Messages.AvoidGriefClaimLand);
        GriefPreventionPlugin.sendMessage(player, TextMode.Instr, Messages.SurvivalBasicsVideo2);

        // give the player a reference book for later
        if (GriefPreventionPlugin.getActiveConfig(player.getWorld().getProperties()).getConfig().claim.deliverManuals) {
            ItemStack.Builder factory = Sponge.getGame().getRegistry().createBuilder(ItemStack.Builder.class);
            DataStore datastore = GriefPreventionPlugin.instance.dataStore;
            final ItemStack itemStack = factory.itemType(ItemTypes.WRITTEN_BOOK).quantity(1).build();

            final AuthorData authorData = itemStack.getOrCreate(AuthorData.class).get();
            authorData.set(Keys.BOOK_AUTHOR, Text.of(datastore.getMessage(Messages.BookAuthor)));
            itemStack.offer(authorData);

            final DisplayNameData displayNameData = itemStack.getOrCreate(DisplayNameData.class).get();
            displayNameData.set(Keys.DISPLAY_NAME, Text.of(datastore.getMessage(Messages.BookTitle)));
            displayNameData.set(Keys.CUSTOM_NAME_VISIBLE, true);
            itemStack.offer(displayNameData);


            StringBuilder page1 = new StringBuilder();
            String URL = datastore.getMessage(Messages.BookLink, DataStore.SURVIVAL_VIDEO_URL_RAW);
            String intro = datastore.getMessage(Messages.BookIntro);

            page1.append(URL).append("\n\n");
            page1.append(intro).append("\n\n");
            String editToolName =
                    GriefPreventionPlugin.instance.modificationTool.getId().replace('_', ' ')
                            .toLowerCase();
            String infoToolName =
                    GriefPreventionPlugin.instance.investigationTool.getId().replace('_', ' ')
                            .toLowerCase();
            String configClaimTools = datastore.getMessage(Messages.BookTools, editToolName, infoToolName);
            page1.append(configClaimTools);
            if (GriefPreventionPlugin.getActiveConfig(player.getWorld().getProperties()).getConfig().claim.claimRadius < 0) {
                page1.append(datastore.getMessage(Messages.BookDisabledChestClaims));
            }

            StringBuilder page2 = new StringBuilder(datastore.getMessage(Messages.BookUsefulCommands)).append("\n\n");
            page2.append("/Trust /UnTrust /TrustList\n");
            page2.append("/ClaimsList\n");
            page2.append("/AbandonClaim\n\n");
            page2.append("/IgnorePlayer\n\n");
            page2.append("/SubdivideClaims\n");
            page2.append("/AccessTrust\n");
            page2.append("/ContainerTrust\n");
            //page2.append("/PermissionTrust");
            try {
                final Text page2Text = SpongeTexts.fromLegacy(page2.toString());
                final Text page1Text = SpongeTexts.fromLegacy(page1.toString());

                final PagedData pagedData = itemStack.getOrCreate(PagedData.class).get();
                pagedData.set(pagedData.pages().add(page1Text).add(page2Text));
                itemStack.offer(pagedData);

            } catch (Exception e) {
                e.printStackTrace();
            }

            ((EntityPlayer) player).inventory.addItemStackToInventory((net.minecraft.item.ItemStack) (Object) itemStack.copy());
        }*/

    }

}
