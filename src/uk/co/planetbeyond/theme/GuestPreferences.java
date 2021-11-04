/*
 * Copyright 2009-2014 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.planetbeyond.theme;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServlet;

@ManagedBean
@SessionScoped
public class GuestPreferences extends HttpServlet implements Serializable
{
	private String layout = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("LAYOUT");
	private boolean darkMenu = Boolean.parseBoolean(FacesContext.getCurrentInstance().getExternalContext().getInitParameter("menu.DARK"));
	private String theme = FacesContext.getCurrentInstance().getExternalContext().getInitParameter("our.THEME");

	public String getTheme()
	{
		return theme;
	}

	public void setTheme(String theme)
	{
		this.theme = theme;
	}

	public String getLayout()
	{
		return layout;
	}

	public void setLayout(String layout)
	{
		this.layout = layout;
	}

	public boolean isDarkMenu()
	{
		return darkMenu;
	}

	public void setDarkMenu(boolean darkMenu)
	{
		this.darkMenu = darkMenu;
	}
}
