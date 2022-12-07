package org.dreambot;

import com.archerfish.behavior.InitialBankCheckBranch;
import com.archerfish.behavior.PieDishBranch;
import com.archerfish.behavior.initialBankCheckLeafs.InitialCheckBankLeaf;
import com.archerfish.behavior.initialBankCheckLeafs.InitialRunToBankLeaf;
import com.archerfish.behavior.pieDishLeafs.*;
import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.framework.Branch;
import org.dreambot.framework.Tree;
import org.dreambot.paint.CustomPaint;
import org.dreambot.paint.PaintInfo;
import org.dreambot.utilities.API;

import java.awt.*;

@ScriptManifest(category = Category.MISC, author = "Malls Archerfish", name = "Pie Shell Bot v2", description = "An AIO bot to make pie shells", version = 0.01)
public class Main extends AbstractScript implements PaintInfo {

    /**
     * @param args script quick launch arguments
     */

    @Override
    public void onStart(String... args) {
        instantiateTree();
    }

    /**
     * On start from script launcher
     */
    @Override
    public void onStart() {
        instantiateTree();
    }


    private final Tree<Main> tree = new Tree<>();
    private Branch<Main> initialBankCheckBranch;
    private Branch<Main> pieDishBranch;

    private void instantiateTree() {
        initialBankCheckBranch = new InitialBankCheckBranch();
        pieDishBranch = new PieDishBranch();

        tree.addBranches(
                initialBankCheckBranch.addLeafs(new InitialRunToBankLeaf(), new InitialCheckBankLeaf()),
                pieDishBranch.addLeafs(new HasEnoughDishesAndDoughLeaf(), new MakePastryDoughLeaf(),
                        new HasEnoughGoldForDishesLeaf(), new HasEnoughClayAndJugsLeaf(), new HasEnoughJugsLeaf(),
                        new HasEnoughJugPacksLeaf(), new NotEnoughJugsLeaf(), new NotEnoughJugsOrGoldLeaf(),
                        new EarnGoldForJugsLeaf(), new MineClayLeaf()));
    }


    /**
     * onLoop is a infinite loop
     * @return gets the leaf and executes it
     */

    @Override
    public int onLoop() {

        return this.tree.onLoop();
    }

    /**
     * @return the information for the paint
     */
    @Override
    public String[] getPaintInfo() {
        return new String[] {
                getManifest().name() + " V" + getManifest().version(),
                "Current Branch: " + API.currentBranch,
                "Current Leaf: " + API.currentLeaf
        };
    }

    /**
     * Instantiate the paint object, can be customized to liking.
     */
    private final CustomPaint CUSTOM_PAINT = new CustomPaint(this,
            CustomPaint.PaintLocations.TOP_LEFT_PLAY_SCREEN, new Color[]{new Color(255, 251, 255)},
            "Trebuchet MS",
            new Color[]{new Color(50, 50, 50, 175)},
            new Color[]{new Color(28, 28, 29)},
            1, false, 5, 3, 0);

    private final RenderingHints aa = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);


    /**
     * paint for the script
     */
    @Override
    public void onPaint(Graphics g) {
        Graphics2D gg = (Graphics2D) g;
        gg.setRenderingHints(aa);

        CUSTOM_PAINT.paint(gg);
    }

}
