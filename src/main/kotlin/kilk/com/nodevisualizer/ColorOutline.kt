package kilk.com.nodevisualizer

import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.layout.BorderPane
import javafx.scene.layout.GridPane

object ColorOutline : GridPane() {
    val borderPane = BorderPane()
    init {

        borderPane.top = SectionSelector
        borderPane.center = NodeSelector
        borderPane.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE)

        ColorOutline.padding = Insets(0.0)
        ColorOutline.alignment = Pos.CENTER
        ColorOutline.style = "-fx-background-color: #a8a8a8; -fx-border-color: #000000; -fx-border-width: 15 15 15 15"
        ColorOutline.add(borderPane, 0, 0)
    }
}