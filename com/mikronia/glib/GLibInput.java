/*
 * MIT License
 * 
 * Copyright (c) 2019 Thaynan Silva
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.mikronia.glib;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * GLib input manager
 * 
 * @author Thaynan M. Silva
 * @version 1.0
 */
public final class GLibInput {
	
	public static final int BUTTON_1           = 0x01;
	public static final int BUTTON_2           = 0x02;
	public static final int BUTTON_3           = 0x03;
	
	///////////////////////////////////

    public static final int VK_ENTER           = '\n';
    public static final int VK_BACK_SPACE      = '\b';
    public static final int VK_TAB             = '\t';
    public static final int VK_CANCEL          = 0x03;
    public static final int VK_CLEAR           = 0x0C;
    public static final int VK_SHIFT           = 0x10;
    public static final int VK_CONTROL         = 0x11;
    public static final int VK_ALT             = 0x12;
    public static final int VK_PAUSE           = 0x13;
    public static final int VK_CAPS_LOCK       = 0x14;
    public static final int VK_ESCAPE          = 0x1B;
    public static final int VK_SPACE           = 0x20;
    public static final int VK_PAGE_UP         = 0x21;
    public static final int VK_PAGE_DOWN       = 0x22;
    public static final int VK_END             = 0x23;
    public static final int VK_HOME            = 0x24;

    public static final int VK_LEFT            = 0x25;
    public static final int VK_UP              = 0x26;
    public static final int VK_RIGHT           = 0x27;
    public static final int VK_DOWN            = 0x28;

    public static final int VK_COMMA           = 0x2C;
    public static final int VK_MINUS           = 0x2D;
    public static final int VK_PERIOD          = 0x2E;
    public static final int VK_SLASH           = 0x2F;

    public static final int VK_0               = 0x30;
    public static final int VK_1               = 0x31;
    public static final int VK_2               = 0x32;
    public static final int VK_3               = 0x33;
    public static final int VK_4               = 0x34;
    public static final int VK_5               = 0x35;
    public static final int VK_6               = 0x36;
    public static final int VK_7               = 0x37;
    public static final int VK_8               = 0x38;
    public static final int VK_9               = 0x39;

    public static final int VK_SEMICOLON       = 0x3B;
    public static final int VK_EQUALS          = 0x3D;

    public static final int VK_A               = 0x41;
    public static final int VK_B               = 0x42;
    public static final int VK_C               = 0x43;
    public static final int VK_D               = 0x44;
    public static final int VK_E               = 0x45;
    public static final int VK_F               = 0x46;
    public static final int VK_G               = 0x47;
    public static final int VK_H               = 0x48;
    public static final int VK_I               = 0x49;
    public static final int VK_J               = 0x4A;
    public static final int VK_K               = 0x4B;
    public static final int VK_L               = 0x4C;
    public static final int VK_M               = 0x4D;
    public static final int VK_N               = 0x4E;
    public static final int VK_O               = 0x4F;
    public static final int VK_P               = 0x50;
    public static final int VK_Q               = 0x51;
    public static final int VK_R               = 0x52;
    public static final int VK_S               = 0x53;
    public static final int VK_T               = 0x54;
    public static final int VK_U               = 0x55;
    public static final int VK_V               = 0x56;
    public static final int VK_W               = 0x57;
    public static final int VK_X               = 0x58;
    public static final int VK_Y               = 0x59;
    public static final int VK_Z               = 0x5A;

    public static final int VK_OPEN_BRACKET    = 0x5B;
    public static final int VK_BACK_SLASH      = 0x5C;
    public static final int VK_CLOSE_BRACKET   = 0x5D;

    public static final int VK_NUMPAD0         = 0x60;
    public static final int VK_NUMPAD1         = 0x61;
    public static final int VK_NUMPAD2         = 0x62;
    public static final int VK_NUMPAD3         = 0x63;
    public static final int VK_NUMPAD4         = 0x64;
    public static final int VK_NUMPAD5         = 0x65;
    public static final int VK_NUMPAD6         = 0x66;
    public static final int VK_NUMPAD7         = 0x67;
    public static final int VK_NUMPAD8         = 0x68;
    public static final int VK_NUMPAD9         = 0x69;

    public static final int VK_MULTIPLY        = 0x6A;
    public static final int VK_ADD             = 0x6B;
    public static final int VK_SEPARATOR       = 0x6C;
    public static final int VK_SUBTRACT        = 0x6D;
    public static final int VK_DECIMAL         = 0x6E;
    public static final int VK_DIVIDE          = 0x6F;
    public static final int VK_DELETE          = 0x7F;
    public static final int VK_NUM_LOCK        = 0x90;
    public static final int VK_SCROLL_LOCK     = 0x91;
    
    public static final int VK_F1              = 0x70;
    public static final int VK_F2              = 0x71;
    public static final int VK_F3              = 0x72;
    public static final int VK_F4              = 0x73;
    public static final int VK_F5              = 0x74;
    public static final int VK_F6              = 0x75;
    public static final int VK_F7              = 0x76;
    public static final int VK_F8              = 0x77;
    public static final int VK_F9              = 0x78;
    public static final int VK_F10             = 0x79;
    public static final int VK_F11             = 0x7A;
    public static final int VK_F12             = 0x7B;
    public static final int VK_F13             = 0xF000;
    public static final int VK_F14             = 0xF001;
    public static final int VK_F15             = 0xF002;
    public static final int VK_F16             = 0xF003;
    public static final int VK_F17             = 0xF004;
    public static final int VK_F18             = 0xF005;
    public static final int VK_F19             = 0xF006;
    public static final int VK_F20             = 0xF007;
    public static final int VK_F21             = 0xF008;
    public static final int VK_F22             = 0xF009;
    public static final int VK_F23             = 0xF00A;
    public static final int VK_F24             = 0xF00B;

    public static final int VK_PRINTSCREEN     = 0x9A;
    public static final int VK_INSERT          = 0x9B;
    public static final int VK_HELP            = 0x9C;
    public static final int VK_META            = 0x9D;
    public static final int VK_BACK_QUOTE      = 0xC0;
    public static final int VK_QUOTE           = 0xDE;

    public static final int VK_KP_UP           = 0xE0;
    public static final int VK_KP_DOWN         = 0xE1;
    public static final int VK_KP_LEFT         = 0xE2;
    public static final int VK_KP_RIGHT        = 0xE3;
    
    public static final int VK_DEAD_GRAVE                = 0x80;
    public static final int VK_DEAD_ACUTE                = 0x81;
    public static final int VK_DEAD_CIRCUMFLEX           = 0x82;
    public static final int VK_DEAD_TILDE                = 0x83;
    public static final int VK_DEAD_MACRON               = 0x84;
    public static final int VK_DEAD_BREVE                = 0x85;
    public static final int VK_DEAD_ABOVEDOT             = 0x86;
    public static final int VK_DEAD_DIAERESIS            = 0x87;
    public static final int VK_DEAD_ABOVERING            = 0x88;
    public static final int VK_DEAD_DOUBLEACUTE          = 0x89;
    public static final int VK_DEAD_CARON                = 0x8a;
    public static final int VK_DEAD_CEDILLA              = 0x8b;
    public static final int VK_DEAD_OGONEK               = 0x8c;
    public static final int VK_DEAD_IOTA                 = 0x8d;
    public static final int VK_DEAD_VOICED_SOUND         = 0x8e;
    public static final int VK_DEAD_SEMIVOICED_SOUND     = 0x8f;

    public static final int VK_AMPERSAND                 = 0x96;
    public static final int VK_ASTERISK                  = 0x97;
    public static final int VK_QUOTEDBL                  = 0x98;
    public static final int VK_LESS                      = 0x99;

    public static final int VK_GREATER                   = 0xa0;
    public static final int VK_BRACELEFT                 = 0xa1;
    public static final int VK_BRACERIGHT                = 0xa2;

    public static final int VK_AT                        = 0x0200;
    public static final int VK_COLON                     = 0x0201;
    public static final int VK_CIRCUMFLEX                = 0x0202;
    public static final int VK_DOLLAR                    = 0x0203;
    public static final int VK_EURO_SIGN                 = 0x0204;
    public static final int VK_EXCLAMATION_MARK          = 0x0205;
    public static final int VK_INVERTED_EXCLAMATION_MARK = 0x0206;
    public static final int VK_LEFT_PARENTHESIS          = 0x0207;
    public static final int VK_NUMBER_SIGN               = 0x0208;
    public static final int VK_PLUS                      = 0x0209;
    public static final int VK_RIGHT_PARENTHESIS         = 0x020A;
    public static final int VK_UNDERSCORE                = 0x020B;

    public static final int VK_WINDOWS                   = 0x020C;
    public static final int VK_CONTEXT_MENU              = 0x020D;

    public static final int VK_FINAL                     = 0x0018;
    public static final int VK_CONVERT                   = 0x001C;
    public static final int VK_NONCONVERT                = 0x001D;
    public static final int VK_ACCEPT                    = 0x001E;
    public static final int VK_MODECHANGE                = 0x001F;
    public static final int VK_KANA                      = 0x0015;
    public static final int VK_KANJI                     = 0x0019;
    public static final int VK_ALPHANUMERIC              = 0x00F0;

    public static final int VK_KATAKANA                  = 0x00F1;
    public static final int VK_HIRAGANA                  = 0x00F2;
    public static final int VK_FULL_WIDTH                = 0x00F3;
    public static final int VK_HALF_WIDTH                = 0x00F4;
    public static final int VK_ROMAN_CHARACTERS          = 0x00F5;
    public static final int VK_ALL_CANDIDATES            = 0x0100;
    public static final int VK_PREVIOUS_CANDIDATE        = 0x0101;
    public static final int VK_CODE_INPUT                = 0x0102;

    public static final int VK_JAPANESE_KATAKANA         = 0x0103;
    public static final int VK_JAPANESE_HIRAGANA         = 0x0104;

    public static final int VK_JAPANESE_ROMAN            = 0x0105;
    public static final int VK_KANA_LOCK                 = 0x0106;
    public static final int VK_INPUT_METHOD_ON_OFF       = 0x0107;

    public static final int VK_CUT                       = 0xFFD1;
    public static final int VK_COPY                      = 0xFFCD;
    public static final int VK_PASTE                     = 0xFFCF;
    public static final int VK_UNDO                      = 0xFFCB;
    public static final int VK_AGAIN                     = 0xFFC9;
    public static final int VK_FIND                      = 0xFFD0;
    public static final int VK_PROPS                     = 0xFFCA;
    public static final int VK_STOP                      = 0xFFC8;

    public static final int VK_COMPOSE                   = 0xFF20;
    public static final int VK_ALT_GRAPH                 = 0xFF7E;
    public static final int VK_BEGIN                     = 0xFF58;

    public static final int VK_UNDEFINED      	         = 0x0000;

    ///////////////////////////////////
    
    // mouse map
    private static boolean[] buttons = new boolean[0x000A];

    // keyboard map
    private static boolean[] keys = new boolean[0xFFE0];

    // mouse properties
    private static boolean mouseOnCanvas = false;
    private static int mouseX = 0;
    private static int mouseY = 0;
    
    ///////////////////////////////////
    
	// key listener
	private static KeyListener keyListener = new KeyListener() {
		
		@Override
		public void keyPressed(KeyEvent e) {
			final int key = e.getKeyCode();
			
			if (key < 0 || key >= keys.length)
				return;
			
			keys[e.getKeyCode()] = true;
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			final int key = e.getKeyCode();
			
			if (key < 0 || key >= keys.length)
				return;
			
			keys[e.getKeyCode()] = false;
		}
		
		@Override
		public void keyTyped(KeyEvent e) { }
		
	};
	
	///////////////////////////////////
	
	// mouse listener
	private static MouseListener mouseListener = new MouseListener() {
		
		@Override
		public void mousePressed(MouseEvent e) {
			buttons[e.getButton()] = true;
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			buttons[e.getButton()] = false;
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			mouseOnCanvas = true;
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			mouseOnCanvas = false;
		}
		
		@Override
		public void mouseClicked(MouseEvent e) { }
		
	};
	
	// mouse motion listener
	private static MouseMotionListener mouseMotionListener = new MouseMotionListener() {
		
		@Override
		public void mouseMoved(MouseEvent e) {
			mouseX = e.getX();
			mouseY = e.getY();
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			mouseX = e.getX();
			mouseY = e.getY();
		}
	};
	
	///////////////////////////////////
	
	// static use only
	private GLibInput() { }
	
	///////////////////////////////////
	
	/**
	 * Initializes the input system.
	 * 
	 * @param app the application
	 */
	public static void initialize() {
		GLibCanvas canvas = GLib.getApplication().canvas();
		
		canvas.addKeyListener(keyListener);
		canvas.addMouseListener(mouseListener);
		canvas.addMouseMotionListener(mouseMotionListener);
	}
	
	/**
	 * Terminates the input system.
	 */
	public static void terminate() {
		GLibCanvas canvas = GLib.getApplication().canvas();
		
		canvas.removeKeyListener(keyListener);
		canvas.removeMouseListener(mouseListener);
		canvas.removeMouseMotionListener(mouseMotionListener);
	}
	
	///////////////////////////////////
	
	/**
	 * Tests whether a key is being pressed.
	 * 
	 * @param key the key to be tested
	 * @return {@code true} if the key is being
	 * pressed, otherwise returns {@code false}.
	 */
	public static boolean keyDown(int key) {
		if (key < 0 || key >= keys.length)
			return false;
		return keys[key];
	}
	
	/**
	 * Tests whether a button is being pressed
	 * on the mouse.
	 * 
	 * @param button the button
	 * @return {@code true} if the button is being
	 * pressed, otherwise returns {@code false}.
	 */
	public static boolean mousePressed(int button) {
		if (button < 0 || button >= buttons.length)
			return false;
		return buttons[button];
	}
	
	/**
	 * Gets the mouse X-axis position.
	 */
	public static int getMouseX() {
		return mouseX / GLib.getPixelSize();
	}
	
	/**
	 * Gets the mouse Y-axis position.
	 */
	public static int getMouseY() {
		return mouseY / GLib.getPixelSize();
	}
	
	/**
	 * Makes the specified key disabled.
	 * 
	 * @param key target key
	 */
	public static void dispatchKey(int key) {
		if (key < 0 || key >= keys.length)
			return;
		
		keys[key] = false;
	}
	
	/**
	 * Makes the specified mouse button disabled.
	 * 
	 * @param button target button
	 */
	public static void dispatchButton(int button) {
		if (button < 0 || button >= buttons.length)
			return;
		
		buttons[button] = false;
	}

	/**
	 * Tests whether the mouse is on
	 * the canvas.
	 * 
	 * @return {@code true} if the mouse
	 * is on the canvas, otherwise returns
	 * {@code false}.
	 */
	public static boolean isMouseOnCanvas() {
		return mouseOnCanvas;
	}
}
