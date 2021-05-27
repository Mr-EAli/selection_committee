package com.company.untitled.web.screens.individualprogress;

import com.haulmont.cuba.gui.screen.*;
import com.company.untitled.progress.IndividualProgress;

@UiController("untitled_IndividualProgress.browse")
@UiDescriptor("individual-progress-browse.xml")
@LookupComponent("individualProgressesTable")
@LoadDataBeforeShow
public class IndividualProgressBrowse extends StandardLookup<IndividualProgress> {
}