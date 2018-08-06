/**
 * easyWSDL - easyWSDL toolbox Platform.
 * Copyright (c) 2008,  eBM Websourcing
 * All rights reserved.
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the University of California, Berkeley nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE REGENTS AND CONTRIBUTORS ``AS IS'' AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE REGENTS AND CONTRIBUTORS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.ow2.easywsdl.wsdl.api.abstractElmt;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import org.ow2.easywsdl.wsdl.api.abstractItf.AbsItfDescription;
import org.ow2.easywsdl.wsdl.api.abstractItf.AbsItfFault;
import org.ow2.easywsdl.wsdl.api.abstractItf.AbsItfInput;
import org.ow2.easywsdl.wsdl.api.abstractItf.AbsItfInterfaceType;
import org.ow2.easywsdl.wsdl.api.abstractItf.AbsItfOperation;
import org.ow2.easywsdl.wsdl.api.abstractItf.AbsItfOutput;


/**
 * @author Nicolas Salatge - eBM WebSourcing
 */
public abstract class AbstractInterfaceTypeImpl<E, Op extends AbsItfOperation<? extends AbsItfInput, ? extends AbsItfOutput, ? extends AbsItfFault>>
        extends AbstractWSDLElementImpl<E> implements AbsItfInterfaceType<Op> {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    /**
     * the desc
     */
    @SuppressWarnings("unchecked")
    protected AbsItfDescription desc;

    /**
     * list of operations
     */
    protected List<Op> operations = new ArrayList<Op>();

    
    public AbstractInterfaceTypeImpl(E model, AbstractWSDLElementImpl parent) {
        super(model, parent);
    }
    
    public void addOperation(final Op op) {
        if (this.operations == null) {
            this.operations = new ArrayList<Op>();
        }
        this.operations.add(op);
    }

    public Op getOperation(final QName name) {
        Op res = null;
        for (final Op op : this.operations) {
            if (op.getQName().equals(name)) {
                res = op;
                break;
            }
        }
        return res;
    }

    public List<Op> getOperations() {
        if (this.operations == null) {
            this.operations = new ArrayList<Op>();
        }
        return this.operations;
    }

    /**
     * @return the desc
     */
    @SuppressWarnings("unchecked")
    public AbsItfDescription getDescription() {
        return this.desc;
    }

}
