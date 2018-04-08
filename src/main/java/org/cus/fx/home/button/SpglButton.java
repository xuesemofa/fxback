package org.cus.fx.home.button;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * @author ld
 * @name
 * @table
 * @remarks
 */
public class SpglButton {
    //    点击商品管理
    public static void spgl(Pane pane) {
        pane.getChildren().clear();
        HBox hBox = new HBox();
        Button button1 = new Button("商品上架");
        Button button2 = new Button("商品下架");
        Button button3 = new Button("列表");
        button3.setOnAction(o -> {
            tables(o, pane);
        });
        hBox.getChildren().addAll(button1, button2, button3);
        pane.getChildren().add(hBox);

        VBox vBox = new VBox();
        vBox.setId("spgls");
        Insets insets = new Insets(25, 0, 0, 0);
        vBox.setPadding(insets);
        pane.getChildren().add(vBox);
    }

    private static void tables(ActionEvent event, Pane pane) {
        ObservableList<Node> children = pane.getChildren();
        TableView tableView = new TableView();
        TableColumn column1 = new TableColumn("序号");
        tableView.getColumns().add(column1);
        children.forEach(k -> {
            if (k.getId() != null && k.getId().equals("spgls")) {
                ((VBox) k).getChildren().add(tableView);
            }
        });
    }
//    //    点击确定按钮
//    private static void updatePWD(ActionEvent event, TextField textField) {
//        String text = textField.getText();
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
//        if (text.equals("123")) {
//            Pane pane = (Pane) textField.getParent().getParent();
//            pane.getChildren().clear();
//            alert.setTitle("提示");
//            alert.setContentText("修改密码成功");
//            alert.show();
//        } else {
//            alert.setTitle("警告");
//            alert.setContentText("修改密码失败");
//            alert.show();
//        }
//    }
}
