/*
 * Copyright (C) 2007-2020 Crafter Software Corporation. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.studio.api.v1.util.filter;


import org.craftercms.studio.api.v1.to.ContentItemTO;

import static org.craftercms.studio.api.v2.utils.StudioConfiguration.CONTENT_TYPES_FILTER_PAGES_INCLUDE_PATTERN;

public class PageFilter extends AbstractFilter {

    @Override
    public String getIncludePattern() {
        return studioConfiguration.getProperty(CONTENT_TYPES_FILTER_PAGES_INCLUDE_PATTERN);
    }

    @Override
    public boolean filter(ContentItemTO item) {
        boolean isMatched = match(item.contentType);
        return (!item.component && !item.document && isMatched);
    }
}
