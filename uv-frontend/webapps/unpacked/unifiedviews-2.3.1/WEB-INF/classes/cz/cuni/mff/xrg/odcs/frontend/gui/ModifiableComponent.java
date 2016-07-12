/**
 * This file is part of UnifiedViews.
 *
 * UnifiedViews is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * UnifiedViews is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with UnifiedViews.  If not, see <http://www.gnu.org/licenses/>.
 */
package cz.cuni.mff.xrg.odcs.frontend.gui;

/**
 * Represents a stateful component which is modifiable and the modifications may
 * be saved.
 * 
 * @author Jan Vojt
 */
public interface ModifiableComponent {

    /**
     * Method for testing if ViewCoponent was modified since last save.
     * 
     * @return Is component modified?
     */
    public boolean isModified();

    /**
     * Handler that applies changes performed with this component.
     * 
     * @return success of the operation
     */
    public boolean saveChanges();
}