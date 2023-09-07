import React, {useEffect, useState} from 'react';
import axios from "axios";

function Exam() {
    const [value, setValue] = useState('');
    const [liste, setListe] = useState([]);

    const fetchList = async () => {
        const response = await axios.get('http://localhost:8080/historyList')
        setListe(response.data);
    }

    useEffect(() => {
        fetchList();
    }, []);
    const handleSubmit = async (e) => {
        e.preventDefault();

        if (value < 1 || value > 10) {
            alert('Please enter a value between 1 and 10.');
            return;
        }

        try {
            const res = await fetch(`http://localhost:8080/getvalue/${value}`,
                {
                    method: 'POST',
                    headers: {
                        'Content-type': 'application/json',
                    },
                    body: JSON.stringify(value)
                });
        } catch (error) {
            // Handle error
            console.error(error);
        }
        finally {
            fetchList();
        }
    };

    return (
        <div>
            <p>Bonne chance!!!</p>
            <form onSubmit={handleSubmit}>
                <label htmlFor="nombre">
                    Valeur maximum
                    <input
                        id="nombre"
                        type="number"
                        min="1"
                        max="10"
                        value={value}
                        onChange={(e) => setValue(e.target.value)}
                        required
                    />
                    Entre (1 et 10)
                </label>
                <br />
                <button type="submit">Soumettre</button>
            </form>

            <div>
                <table>
                    <thead>
                        <tr>
                            <th>Essai</th>
                            <th>Valeur</th>
                            <th>Max valeur</th>
                        </tr>
                    </thead>
                    <tbody>
                        {liste?.map((item) => (
                            <tr key={item.id}>
                                <td>{item.id}</td>
                                <td>{item.valeur}</td>
                                <td>{item.maxValeur}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        </div>
    );
}

export default Exam;