/*
 * Copyright (C) 2007-2022 Crafter Software Corporation. All Rights Reserved.
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
package org.craftercms.studio.impl.v2.utils.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * Event used to trigger all cluster related beans during bootstrap
 *
 * @author joseross
 * @since 4.0
 */
public class StartClusterSetupEvent extends ApplicationEvent {

    public StartClusterSetupEvent(Object source) {
        super(source);
    }

}
