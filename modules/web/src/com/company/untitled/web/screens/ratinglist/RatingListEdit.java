package com.company.untitled.web.screens.ratinglist;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.progress.RatingList;

@UiController("untitled_RatingList.edit")
@UiDescriptor("rating-list-edit.xml")
@EditedEntityContainer("ratingListDc")
@LoadDataBeforeShow
public class RatingListEdit extends StandardEditor<RatingList> {
}